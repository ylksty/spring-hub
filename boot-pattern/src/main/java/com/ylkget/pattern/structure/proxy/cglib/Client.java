package com.ylkget.pattern.structure.proxy.cglib;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/4/9 09:57
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell("杭州");
    }
}
