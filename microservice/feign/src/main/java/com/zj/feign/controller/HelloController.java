package com.zj.feign.controller;

import com.zj.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    public HelloService helloService;

    @RequestMapping(value = "/feign-test",method = RequestMethod.GET)
    public String test(){
        return  helloService.helloService();
    }
}
