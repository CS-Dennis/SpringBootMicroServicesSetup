package com.dennis.service2.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Service1Controller {

    @GetMapping("/greeting2")
    public String greeting(){
        System.out.println("called from service1");
        return "Hello world! This is from service 2.";
    }
}
