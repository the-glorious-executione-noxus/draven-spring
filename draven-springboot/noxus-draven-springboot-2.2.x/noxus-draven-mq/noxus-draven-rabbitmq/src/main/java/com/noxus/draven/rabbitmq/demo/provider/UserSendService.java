package com.noxus.draven.rabbitmq.demo.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserSendService {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${mq.config.exchange_name}")
    private String exchange;

    public void send(String msg) {
        //向消息队列发送消息
        //参数一：交换器名称。
        //参数二：路由键
        //参数三：消息
        this.amqpTemplate.convertAndSend(this.exchange, "user.log.debug", "user.log.debug....." + msg);
        this.amqpTemplate.convertAndSend(this.exchange, "user.log.info", "user.log.info....." + msg);
        this.amqpTemplate.convertAndSend(this.exchange, "user.log.warn", "user.log.warn....." + msg);
        this.amqpTemplate.convertAndSend(this.exchange, "user.log.error", "user.log.error....." + msg);
    }
}
