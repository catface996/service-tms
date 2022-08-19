# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/#build-image)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.4.1/reference/htmlsingle/#production-ready)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.4.1/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.1/reference/htmlsingle/#boot-features-developing-web-applications)
* [Cloud Bootstrap](https://spring.io/projects/spring-cloud-commons)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.1/reference/htmlsingle/#using-boot-devtools)
* [Prometheus](https://docs.spring.io/spring-boot/docs/2.4.1/reference/html/production-ready-features.html#production-ready-metrics-export-prometheus)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### 代码生成

GeneratorServiceEntity.generateAllCode 会生dao层的相关代码

### 自定义banner

[自定义banner传送门](http://patorjk.com/software/taag/#p=display&f=Soft&t=tms)

建议使用Soft字体,将生成的内容复制到banner.txt即可,文件路径 app/src/main/resources/banner.txt

### 版本号更新

1.更新所有模块版本号：输入命令：mvn versions:set -DnewVersion=0.0.2-SNAPSHOT

2.如果还有没有修改到的。执行下方的命令重试。

更新子模块版本号：输入命令：mvn versions:update-child-modules

3.如果你后悔更新了。

输入命令：mvn versions:revert 可以回退到上一个版本号

4.如果你觉得OK了。

输入命令：mvn versions:commit 就可以提交版本号了。

切记：提交之后，就无法回退到上个版本号了。