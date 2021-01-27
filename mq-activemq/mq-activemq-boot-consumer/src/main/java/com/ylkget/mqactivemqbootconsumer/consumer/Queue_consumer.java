package com.ylkget.mqactivemqbootconsumer.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

/**
 * @author joe
 * @create 2021-01-27 20:53
 */
@Component
public class Queue_consumer {
    @JmsListener(destination = "${mydestination}")     // 注解监听
    public void receive(TextMessage textMessage) throws  Exception{
        System.out.println(" get: " + textMessage.getText());
    }
}
