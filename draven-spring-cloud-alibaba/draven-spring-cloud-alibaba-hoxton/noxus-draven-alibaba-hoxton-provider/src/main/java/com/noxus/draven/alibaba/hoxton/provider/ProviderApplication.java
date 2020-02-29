package com.noxus.draven.alibaba.hoxton.provider;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RefreshScope
@EnableFeignClients
public class ProviderApplication {
    public static void main(String[] args) {

        SpringApplication.run(ProviderApplication.class, args);
//        SpringApplication  app = new SpringApplication(ProviderApplication.class);
//        app.setBannerMode(Banner.Mode.LOG);
//        app.run(args);
    }
}
