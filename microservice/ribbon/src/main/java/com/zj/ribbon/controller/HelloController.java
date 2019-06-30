package com.zj.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon_test",method = RequestMethod.GET)
    public String test(){
        return restTemplate.getForEntity("http://hello-server/hello",String.class).getBody();
    }
}
