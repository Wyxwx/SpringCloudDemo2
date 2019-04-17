package com.example.demo.interfacePackage;

import org.springframework.stereotype.Component;

/**
 * @Auther: wyx
 * @Date: 2019-04-17 21:05
 * @Description:
 */
@Component
public class FeignHystrix implements HelloWorld {
    @Override
    public String hello() {
        return "hello: sorry, there is an error";
    }

    @Override
    public String hi(String name) {
        return "hi: sorry, there is an error";
    }
}
