package com.jd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JdProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdProviderApplication.class, args);
    }

}
