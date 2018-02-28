Please readme before reading
=
* 将服务注册到注册中心需要在application.properties中进行相关配置    eureka.client.serviesUrl.defaultZone=http://hostname:port/eureka/
* 如果不进行配置则会访问默认注册中心http://localhost:8761/eureka
* PS:前提是你含有已经运行的8761端口的注册中心否则会报错
