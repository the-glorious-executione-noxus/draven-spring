//package com.noxus.draven.alibaba.hoxton.admin;
//
//import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
//import com.alibaba.cloud.nacos.discovery.NacosWatch;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class NacosWatchAutoConfiguration {
//
//    @Bean
//    @ConditionalOnMissingBean
//    @ConditionalOnProperty(value = "spring.cloud.nacos.discovery.watch.enabled", matchIfMissing = true)
//    public NacosWatch nacosWatch(NacosDiscoveryProperties nacosDiscoveryProperties) {
//        return new NacosWatch(nacosDiscoveryProperties);
//    }
//}