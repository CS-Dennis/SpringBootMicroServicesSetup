package com.dennis.service1.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service2")
public interface Service1Interface {
    @GetMapping("/greeting2")
    String greeting();
}
