package com.xzy.springcloud.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringCloud3_1
 * @package 包名：com.xzy.springcloud.indicator
 * @data 创建时间：2018-2-27 8:53
 * @description 描述：自定义RockerMQ检测器
 *                  通过实现HealthIndicator接口
 */
@Component
public class RocketMQHealthIndicator implements HealthIndicator{
    /**
     * 重写health方法
     * @return
     */
    @Override
    public Health health() {
        int errorCode = check();
        if (errorCode !=0){
            return Health.down().withDetail("Error Code",errorCode).build();
        }
        return Health.up().build();
    }

    private int check() {
        //在此添加监控对象的检测操作
        return 0;
    }
}
