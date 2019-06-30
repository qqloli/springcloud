package com.zj.eurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello,host:"+instance.getHost()+",serviceId:"+instance.getServiceId());
        return "hello world !";
    }
}
