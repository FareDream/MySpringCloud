Spring Cloud 基本文件结构含义

src/main/java 下存放的是项目的各种功能类
src/main/resource 下存放的是项目中的各种配置文件。其中application.properties文件为SpringCloud项目的默认配置文件
            如果添加了web模块则还会在其下方生成两个文件夹
                    static文件夹 ：作用是放置一些web项目的静态文件例如。js，css，jpg
                    templates文件夹：放置的是一些web项目前端页面
src/test 下存放的是该项目的测试类