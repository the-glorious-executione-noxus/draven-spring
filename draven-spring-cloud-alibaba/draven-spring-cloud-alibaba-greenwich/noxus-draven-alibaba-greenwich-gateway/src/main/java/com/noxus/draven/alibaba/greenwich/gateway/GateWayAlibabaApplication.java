package com.noxus.draven.alibaba.greenwich.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RefreshScope
public class GateWayAlibabaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayAlibabaApplication.class, args);
    }


    @RequestMapping("/testGateWay")
    public String testConfig() {

        return "testGateWay";
    }
}
