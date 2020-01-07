package com.noxus.draven.alibaba.greenwich.provider.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RefreshScope
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/getString/{fegin}")
    public Mono<String> getString(@PathVariable("fegin") String fegin) {
        return Mono.just(fegin);
    }
}
