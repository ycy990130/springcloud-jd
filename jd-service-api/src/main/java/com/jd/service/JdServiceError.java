package com.jd.service;

import org.springframework.stereotype.Component;

@Component
public class JdServiceError implements JdServiceFeign{
    public void test() {
        System.out.println("消费失败！！！");
    }
}
