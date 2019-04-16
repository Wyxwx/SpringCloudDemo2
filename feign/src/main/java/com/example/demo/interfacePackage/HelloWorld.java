package com.example.demo.interfacePackage;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: wyx
 * @Date: 2019-04-15 10:32
 * @Description:
 */
@FeignClient("ribbonClient")
public interface HelloWorld {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();

}
