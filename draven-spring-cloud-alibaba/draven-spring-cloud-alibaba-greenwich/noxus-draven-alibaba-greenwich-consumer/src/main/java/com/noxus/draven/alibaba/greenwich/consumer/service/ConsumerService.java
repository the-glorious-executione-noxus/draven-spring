package com.noxus.draven.alibaba.greenwich.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@FeignClient(value = "alibaba-provider")
public interface ConsumerService {
    @RequestMapping(value = "/provider/getString/{fegin}")
    public Mono<String> getString(@PathVariable("fegin") String fegin);

}
