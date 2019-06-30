package com.zj.feign.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "hello-server")
public interface HelloServiceInterface {
    @RequestMapping("/hello")
    String hello();
}
