对服务器的配置如端口号可以在application.properties 进行配置
    如果打包后需要临时改变某一项配置文件可以通过java -jar **.jar 运行时在后方加入
    --server.port=8888    PS：--的意思就是对application.properties中的属性进行配置
    PS2：这个修改不是永久的是临时的重启服务的时候就会重置配置为application.properties
        中原来配置的内容
        不过这个方法不是一个很好的方法对于多个不同环境的包的运行
好方法：：：
    使用多配置文件方式