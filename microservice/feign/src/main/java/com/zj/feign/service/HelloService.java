package com.zj.feign.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zj.feign.interfaces.HelloServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    HelloServiceInterface helloServiceInterface;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return  helloServiceInterface.hello();
    }

    public String helloFallback(){
        return "error";
    }
}
