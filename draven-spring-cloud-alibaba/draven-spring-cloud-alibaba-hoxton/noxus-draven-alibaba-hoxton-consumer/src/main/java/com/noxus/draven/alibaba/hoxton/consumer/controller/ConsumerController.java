package com.noxus.draven.alibaba.hoxton.consumer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.noxus.draven.alibaba.hoxton.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
@RequestMapping("/consumer")
public class ConsumerController {
//    @GetMapping("/getString")
//    public Mono<String> getString() {
//        return Mono.just("consumer");
//    }

    @Value("${redis.wawa}")
    private String rediswahaha;

    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/fegin/consumer")
    @SentinelResource("/fegin/consumer")
    public String echo() {
        return consumerService.getString();
    }


    @GetMapping(value = "/consumer")
    public String echotest() {
        return rediswahaha;
    }

}
