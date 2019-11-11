package com.jd.controller;

import com.jd.service.JdService;
import com.jd.service.JdServiceFeign;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class JdController implements JdServiceFeign {

    @Resource
    private JdService jdService;

    @Override
    public void test() {
        System.out.println("feign消费服务成功。。。");
    }
}
