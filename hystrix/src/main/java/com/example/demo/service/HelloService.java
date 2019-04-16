package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: wyx
 * @Date: 2019-04-15 19:57
 * @Description:
 */
@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "defaultHello")
    public String hello(){
        return restTemplate.getForObject("http://ribbonClient/hello", String.class) + ": success";
    }

    public String defaultHello(){
        return "fail";
    }

}
