package com.example.demo.controller;

import com.example.demo.interfacePackage.HelloWorld;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Auther: wyx
 * @Date: 2019-04-15 10:34
 * @Description:
 */
@RestController
public class HelloWorldController {

    @Resource
    private HelloWorld helloWorld;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return helloWorld.hello();
    }

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String hi(@PathVariable("name") String name){
        return helloWorld.hi(name);
    }

}
