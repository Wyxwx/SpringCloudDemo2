package com.example.demo.interfacePackage;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Auther: wyx
 * @Date: 2019-04-18 0:06
 * @Description:
 */
@Component
public class FeignHystrixFactory implements FallbackFactory<HelloWorld> {
    @Override
    public HelloWorld create(Throwable cause) {
        return new HelloWorld() {
            @Override
            public String hello() {
                return "hello: " + cause;
            }

            @Override
            public String hi(String name) {
                return "hi: " + cause;
            }
        };
    }
}
