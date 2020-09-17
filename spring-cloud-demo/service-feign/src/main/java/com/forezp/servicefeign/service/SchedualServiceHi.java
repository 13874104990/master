package com.forezp.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FeignClient注解value对应yml配置文件中的服务名称:service-hi
 * spring:
 * application:
 * name: service-hi
 *
 * fallbackFactory
 *
 * FeignClient 负载均衡默认为轮询,如果想修改负载均衡需要重写规则.
 *
 * FeignClient 中使用断融器.
 *
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    /**
     * 调用service-hi请求
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}