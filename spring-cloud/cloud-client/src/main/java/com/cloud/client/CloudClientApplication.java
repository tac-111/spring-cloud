package com.cloud.client;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient //开启Eureka客户端
@EnableFeignClients //开启Feign客户端
public class CloudClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }

}
