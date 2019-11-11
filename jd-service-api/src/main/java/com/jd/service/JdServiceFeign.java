package com.jd.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "jd-provider",fallback = JdServiceError.class)
public interface JdServiceFeign {


    @GetMapping("/test")
    void test();
}
