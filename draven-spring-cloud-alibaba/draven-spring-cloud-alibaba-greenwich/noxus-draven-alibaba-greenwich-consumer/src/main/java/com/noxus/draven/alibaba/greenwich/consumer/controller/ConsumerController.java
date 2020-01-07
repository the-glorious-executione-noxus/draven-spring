package com.noxus.draven.alibaba.greenwich.consumer.controller;

import com.noxus.draven.alibaba.greenwich.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RefreshScope
@RequestMapping("/consumer")
public class ConsumerController {
    @GetMapping("/getString")
    public Mono<String> getString() {
        return Mono.just("consumer");
    }


    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/fegin/consumer/{fegin}")
    public Mono<String> echo(@PathVariable("fegin") String fegin) {
        return consumerService.getString(fegin);
    }

}
