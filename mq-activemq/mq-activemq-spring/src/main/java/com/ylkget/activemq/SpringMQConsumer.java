package com.ylkget.activemq;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @author joe
 * @create 2021-01-27 18:48
 */
@Service
public class SpringMQConsumer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringMQConsumer sm = (SpringMQConsumer) ac.getBean("springMQConsumer");

        String s = (String) sm.jmsTemplate.receiveAndConvert();
        System.out.println(" *** 消费者消息:" + s);
    }
}
