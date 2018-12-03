package com.hz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yangmengjun
 * @date: 2018\12\3 0003 10:42
 */
@Slf4j
@RestController
public class HelloController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello(){
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        log.info("Hello world.Request from:"+serviceInstance.getHost());
        return "success";
    }
}
