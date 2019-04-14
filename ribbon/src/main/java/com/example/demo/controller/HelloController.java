package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Auther: wyx
 * @Date: 2019-04-14 15:33
 * @Description:
 */
@RestController
public class HelloController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hello")
    public String hello(){
        return restTemplate.getForObject("http://ribbonClient/hello", String.class);
    }

}
