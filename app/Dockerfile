FROM zlyxzq/centos7:v1
VOLUME /tmp
WORKDIR /app
COPY /target/tms-app.jar /root/app/tms-app.jar

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ENV JAVA_HOME /usr/local/java
ENV PATH $PATH:$JAVA_HOME/bin
ENV CLASSPATH .:$JAVA_HOME/lib/rt.jar:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
ENV JAVA_OPTS "-Xmx512M -Xms512M"
ENV SPRING_OPTS "--spring.profiles.active=local"
CMD ["cd /root/app/"]
ENTRYPOINT ["sh","-c","java -Dfile.encoding=UTF-8 ${JAVA_OPTS} -jar /root/app/example-app.jar ${SPRING_OPTS}"]

