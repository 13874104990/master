package com.forezp.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @指定断融异常类.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+ name;
    }
}
