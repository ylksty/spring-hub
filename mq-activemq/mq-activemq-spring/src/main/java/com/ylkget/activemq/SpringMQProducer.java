package com.ylkget.activemq;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.TextMessage;

/**
 * @author joe
 * @create 2021-01-27 18:30
 */
@Service
public class SpringMQProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringMQProducer producer = (SpringMQProducer) ctx.getBean("springMQProducer");

        producer.jmsTemplate.send((session) -> {
            TextMessage textMessage = session.createTextMessage("spring 和 activemq 的整合");
            return textMessage;
        });
        System.out.println(" *** send task over ***");
    }
}
