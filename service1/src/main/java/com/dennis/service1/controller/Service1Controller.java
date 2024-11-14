package com.dennis.service1.controller;

import com.dennis.service1.interfaces.Service1Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Service1Controller {
    @Autowired
    private Service1Interface service1Interface;

    @GetMapping("/greeting1")
    public String greeting(){
        return service1Interface.greeting();
    }
}
