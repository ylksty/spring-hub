package com.ylkget.pattern.structure.proxy.jdk;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/4/9 14:07
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();

        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        while (true) {}

    }
}
