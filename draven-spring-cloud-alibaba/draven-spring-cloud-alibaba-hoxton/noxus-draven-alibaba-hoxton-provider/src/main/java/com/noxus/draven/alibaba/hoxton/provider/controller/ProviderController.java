package com.noxus.draven.alibaba.hoxton.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
@RequestMapping("/provider")
public class ProviderController {


    @Value("${mysql.url}")
    private String url;

    @GetMapping(value = "/getString")
    public String getString() {

        System.out.println("111111");

        return "11" + url;
    }
}
