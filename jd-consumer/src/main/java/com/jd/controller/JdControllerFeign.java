package com.jd.controller;

import com.jd.service.JdServiceFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class JdControllerFeign {

    @Resource
    private JdServiceFeign jdServiceFeign;


    @RequestMapping("/test")
    public void test(){
        jdServiceFeign.test();
    }

}
