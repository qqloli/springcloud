package com.zj.hystrix.controller;

import com.zj.hystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    public HelloService helloService;
    @RequestMapping(value = "/hystrix-test",method = RequestMethod.GET)
    public String helloController(){
        return helloService.helloService();
    }
}
