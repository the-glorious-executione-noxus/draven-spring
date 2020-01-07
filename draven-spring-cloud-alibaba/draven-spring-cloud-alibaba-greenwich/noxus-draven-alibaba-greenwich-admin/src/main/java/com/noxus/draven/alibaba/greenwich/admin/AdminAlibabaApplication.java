package com.noxus.draven.alibaba.greenwich.admin;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@EnableDiscoveryClient
@SpringBootApplication
@RestController
@EnableAdminServer
@RefreshScope
public class AdminAlibabaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminAlibabaApplication.class, args);
    }


    @GetMapping("/testAdmin")
    @SentinelResource("testAdmin")
    public Mono<String> testConfig() {
        return Mono.just("testAdmin");
    }
}
