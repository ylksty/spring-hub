package com.ylkget.mqactivemqbootproduce.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

/**
 * @author joe
 * @create 2021-01-27 20:18
 */
@Component
@EnableJms
public class ConfigBean {
    @Value("${mydestination}")
    private String myQueue ;    // 注入配置文件中的 mydestination

    @Bean   // bean id=""  class="…"
    public ActiveMQQueue queue(){
        return  new ActiveMQQueue(myQueue);
    }
}
