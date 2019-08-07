/*
 * msxf.com Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明
 *
 * @author hanwen.mei@msxf.com
 * @version cont.java, 2019/8/7 15:52
 */
@RestController
@RequestMapping("/test")
public class cont {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping(value = "/aa")
    public String importDialRecord(String req) {
        String topic = "test1";
        String message = req;
        log.info("request test req: {}", req);
        log.info("sending message='{}' to topic='{}'", message, topic);
        kafkaTemplate.send(topic, message);
        return "true";
    }
}
