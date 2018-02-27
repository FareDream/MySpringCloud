可以通过创建多注册中心的方式来构造Eureka server 集群
同时可以使用#eureka.client.serviceUrl.defaultZone=http://peer1:1111/eureka/,http://peer2:1112/eureka/方法
            将某一服务同时注册到多个注册中心中从而使当某一注册中心故障的时候服务依旧可以正常运行
如果不希望通过主机名的方式访问注册中心还可以使用IP地址的方式访问
        需在application.properties中配置 eureka.instance.prefer-ip-address=true //默认该值为false