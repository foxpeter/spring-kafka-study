/*
 * msxf.com Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * 类说明
 *
 * @author hanwen.mei@msxf.com
 * @version ConsumerListener.java, 2019/8/1 17:26
 */
@Component
public class ConsumerListener {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "test1")
    public void onMessage(@Payload String message, @Headers MessageHeaders headers) {
        headers.keySet().forEach(key -> log.info("{}: {}", key, headers.get(key)));
        log.info("msg==========: {}", message);
    }
}