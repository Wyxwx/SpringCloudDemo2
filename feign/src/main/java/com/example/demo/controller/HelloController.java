package com.example.demo.controller;

import com.example.demo.interfacePackage.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: wyx
 * @Date: 2019-04-15 10:34
 * @Description:
 */
@RestController
public class HelloController {

    @Resource
    private HelloWorld helloWorld;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return helloWorld.hello();
    }

    /**
     * 报错
     * Feign 不支持 GetMapping
     */
    @GetMapping(value = "/hello")
    public String hi(){
        return helloWorld.hello();
    }

}
