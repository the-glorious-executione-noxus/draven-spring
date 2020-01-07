package com.noxus.draven.alibaba.greenwich.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "alibaba-provider")
public interface ConsumerService {
    @RequestMapping(value = "/provider/getString",consumes = MediaType.TEXT_PLAIN_VALUE)
    String getString();

}
