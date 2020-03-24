package com.noxus.draven.alibaba.hoxton.gateway.config;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Component
public class TimeBetweenRoutePredicateFactory extends AbstractRoutePredicateFactory<TimeBeetweenConfig> {
    public TimeBetweenRoutePredicateFactory() {
        super(TimeBeetweenConfig.class);
    }

    /**
     * 匹配字段关键字
     * @return
     */
    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("start", "end");
    }

    /**
     *
     * @param config
     * @return
     */
    @Override
    public Predicate<ServerWebExchange> apply(TimeBeetweenConfig config) {
        LocalTime start = config.getStart();
        LocalTime end = config.getEnd();
        return exchange -> {
            LocalTime now = LocalTime.now();
            return now.isAfter(start) && now.isBefore(end);
        };
    }
}
