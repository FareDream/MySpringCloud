# MySpringCloud
我的SpringCloud学习历程
* Eureka中各个实例的健康检测不是通过spring-boot-autuator中/health端点完成的。而是依靠客户端心跳的额方式来保持服务实例的存活
  * 很多情况下客户端心跳依旧进行但是由于其他因素例如数据库断开等原因造成的服务不可用，Eureka的实例依旧会存活被消费者调用。
  * 我们此时就可以将Eureka客户端的健康监测移交给spring-boot-autuator完成
  * 我们首先引入autuator依赖
  * 在application.properties中添加配置eureka.client.healthcheck.enable=true
