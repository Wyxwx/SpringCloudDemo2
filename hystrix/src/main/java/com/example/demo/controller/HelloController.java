package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: wyx
 * @Date: 2019-04-15 19:57
 * @Description:
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping(value = "/hello")
    public String hello(){
        return helloService.hello();
    }
}
