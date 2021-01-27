package com.ylkget.mqactivemqbootproduce.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

/**
 * @author joe
 * @create 2021-01-27 20:19
 */
@Component
public class Queue_Produce {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate ;

    @Autowired
    private Queue queue ;

    // 调用一次一个信息发出
    public void produceMessage(){
        jmsMessagingTemplate.convertAndSend(queue,"****"+ UUID.randomUUID().toString().substring(0,6));
    }

    // 带定时投递的业务方法
    @Scheduled(fixedDelay = 3000)    // 每3秒自动调用
    public void produceMessageScheduled() {
        String msg = "** scheduled **" + UUID.randomUUID().toString().substring(0,6);
        jmsMessagingTemplate.convertAndSend(queue, msg);
        System.out.println("send: " + msg);
    }
}
