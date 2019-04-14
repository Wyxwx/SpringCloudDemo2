package com.example.demo.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;

/**
 * @Auther: wyx
 * @Date: 2019-04-14 15:33
 * @Description:
 */
@RestController
public class HelloController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/hello")
    public String hello(){
        return restTemplate.getForObject("http://ribbonClient/hello", String.class);
    }

    @RequestMapping(value = "/hi")
    public String hi(){
        ServiceInstance instance = loadBalancerClient.choose("ribbonClient");
        URI uri = URI.create(String.format("http://%s:%s", instance.getHost(), instance.getPort()));
        return "uri: " + uri;
    }

}
