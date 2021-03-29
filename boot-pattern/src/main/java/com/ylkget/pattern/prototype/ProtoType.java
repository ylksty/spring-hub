package com.ylkget.pattern.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * ProtoType
 * </p>
 *
 * @author joe 2021/3/28 14:38
 */
public class ProtoType {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 获取monster[通过id获取monster]
        Object bean = applicationContext.getBean("id01");
        System.out.println("bean" + bean); // 输出 "牛魔王" .....

        Object bean2 = applicationContext.getBean("id01");

        System.out.println("bean2" + bean2); //输出 "牛魔王" .....

        System.out.println(bean == bean2); // false

        // ConfigurableApplicationContext
    }
}
