package com.forezp.springbootactuator.service;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * actuator 自定义 health配置信息。
 * @author Administrator
 */
@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {

        builder.up().withDetail("app","这个项目很健康。").withDetail("error","nothing,I,m very good ");
    }
}
