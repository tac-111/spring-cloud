package com.cloud.client.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class Sender {

    @Resource
    private AmqpTemplate rabbitmqTemplate;

    public void send(){
        String content = "hello" + new Date();
        System.out.println("Sender:" +content);
        this.rabbitmqTemplate.convertAndSend("hello", content);
    }


}
