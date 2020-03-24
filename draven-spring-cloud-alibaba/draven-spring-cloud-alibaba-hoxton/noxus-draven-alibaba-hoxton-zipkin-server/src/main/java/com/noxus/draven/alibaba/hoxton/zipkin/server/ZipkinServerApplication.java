package com.noxus.draven.alibaba.hoxton.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@RestController
@EnableDiscoveryClient
public class ZipkinServerApplication {
    public static void main(String[] args) {

//        new SpringApplicationBuilder(ZipkinServerApplication.class)
//                .listeners(new RegisterZipkinHealthIndicators())
//                .properties("spring.config.name=alibaba-zipkin-server")
//                //.properties("spring.config.location=classpath:/springcloud/zipkin-server.yml").run(args);
//                .run(args);

        SpringApplication.run(ZipkinServerApplication.class, args);
    }

    @RequestMapping("/test")
    public String getStringt() {
        return "test";
    }

}
