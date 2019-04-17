package com.example.demo.interfacePackage;

import com.example.demo.config.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: wyx
 * @Date: 2019-04-15 10:32
 * @Description:
 */
@FeignClient(name = "ribbonClient", fallback = FeignHystrix.class)
//@FeignClient(name = "ribbonClient", fallbackFactory = FeignHystrixFactory.class)
//@FeignClient(name = "ribbonClient", configuration = FeignConfiguration.class)
//@FeignClient(name = "ribbonClient")
public interface HelloWorld {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();

    @RequestMapping(method = RequestMethod.GET, value = "/hi/{name}")
    String hi(@PathVariable("name") String name);

}
