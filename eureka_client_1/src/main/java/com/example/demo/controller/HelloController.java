package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wyx
 * @Date: 2019-04-14 15:15
 * @Description:
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello")
    public String hello(){
        return "my port is " + port;
    }

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String hi(@PathVariable("name") String name){
        return "Hi, " + name + ", my port is " + port;
    }

}
