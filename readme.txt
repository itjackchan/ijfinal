JFinal框架初试：
1. 本项目若是以main函数启动，请访问 
	http://localhost:89/hello

2. 本项目若是部署tomcat，请访问 
	http://localhost:8080/ijfinal/hello
	http://localhost:8080/ijfinal/index.jsp



在Tomcat部署JFinal时控制台报出如下错误：
java.lang.ClassNotFoundException: com.jfinal.core.JFinalFilter
JFinalFilter实际上是JFinal的核心jar包自带的过滤器，所以只可能是这个jar包在发布的时候没有被打包。
既然分析出问题，那么后续就会很方便解决。
右击项目---properties---MyEclipse---Deployment Assemby，然后点击右边的Add---Java Build Path Entries---Maven Dependencies，将Maven所添加的依赖加入进来，点击Finish---Apply---OK，重新部署一下项目，重启Tomcat，问题解决。
