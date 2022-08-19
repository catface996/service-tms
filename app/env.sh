##########################
####### 基础环境 ##########
##########################
##!/bim/bash

deploy_home=/usr/local/service

deploy_dir=$deploy_home/$APP_NAME

deploy_dir_jar=$deploy_dir/current/$JAR_NAME

# deployEnv
function check_env(){
	deploy_env=$ENV

	echo " >>>>> $deploy_env check running!!!"

	if [ "$deploy_env" = "dev" ]
	then
		JAVA_OPTS=$JAVA_OPTS_DEV
	elif [ "$deploy_env" = "uat" ]
	then
		JAVA_OPTS=$JAVA_OPTS_UAT
	elif [ "$deploy_env" = "prod" ]
	then
		JAVA_OPTS=$JAVA_OPTS_PROD
	else
	     echo "*************** env error *****"
	     exit 1
	fi
}

function block_kill_app(){
	
	for ii in `ps -ef | grep java | grep $PROJECT_NAME | awk '{print $2}'`
	do
		echo " >>>> Killing $PROJECT_NAME process: $ii"
		kill -9 $ii
	done


	len=$(ps -ef | grep java | grep $PROJECT_NAME | awk '{print $2}')
	while [ -n "$len" ]
	do
		sleep 2s
		len=$(ps -ef | grep java | grep $PROJECT_NAME | awk '{print $2}')
		kill -9 $ii
	done
}

function deploy_app(){
	check_env
	
	block_kill_app

	nohup $JAVA_PATH/java $JAVA_OPTS -jar $deploy_dir_jar --spring.profiles.active=$ENV > $deploy_dir/current/nohup.out 2>&1 &

	echo " >>> java $JAVA_OPTS -jar $deploy_dir_jar "

	for ii in `ps -ef | grep java | grep $JAR_NAME | awk '{print $2}'`
	do
		res=$ii
		echo " >>>> $JAR_NAME process new pid: $ii"
	done

	if [ -n "$res" ]; then
		echo ">>>>>>>  $JAR_NAME application depoly success!!!!"
	else 
		echo ">>>>>>>  $JAR_NAME application depoly failure!!!!"
	fi
		#statements
}

# 启动统一入口
function run_app(){

	if [ "$COMMAND" = "restart" ]
	then
		# 重启不需要备份以及jar转移
		echo " >>>> $JAR_NAME will restart <<<<<<"
	elif [ "$COMMAND" = "rollback" ]
	then
		# 将 current jar 转移到 backup下
		for ii in `ls -l $deploy_dir/current/ | awk '{print $9}'`
		do
			mv $deploy_dir/current/$ii $deploy_dir/backup/
		done
		# 将 current jar 转移到 backup下
		flag=$(ls -l $deploy_dir/backup/ | grep $JAR_NAME | awk '{print $9}')
		if [ -n "$flag" ]; then
			mv $deploy_dir/backup/$JAR_NAME $deploy_dir/current/
		else 
			echo " >>>>>>> No $JAR_NAME to be released was found <<<<<<<<<"
			exit 1
		fi
		
		echo " >>>> $JAR_NAME will rollback <<<<<<"
	elif [ "$COMMAND" = "release" ]
	then
		# 将 current jar 转移到 backup下
		for ii in `ls -l $deploy_dir/current/ | awk '{print $9}'`
		do
			mv $deploy_dir/current/$ii $deploy_dir/backup/
		done
		flag=$(ls -l $deploy_dir/target/ | grep $JAR_NAME | awk '{print $9}')
		if [ -n "$flag" ]; then
			mv $deploy_dir/target/$JAR_NAME $deploy_dir/current/
		else 
			echo " >>>>>>> No $JAR_NAME to be released was found <<<<<<<<<"
			exit 1
		fi
		echo " >>>> $JAR_NAME will release <<<<<<"
	else
	     block_kill_app
	     exit 1
	fi

	deploy_app

}

