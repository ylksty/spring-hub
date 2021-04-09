package com.ylkget.pattern.structure.proxy.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p>
 * ProxyFactory
 * </p>
 *
 * @author joe 2021/4/9 09:43
 */
public class ProxyFactory implements MethodInterceptor {
    private TrainStation target = new TrainStation();

    public TrainStation getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        TrainStation trainStation = (TrainStation) enhancer.create();
        return trainStation;
    }

    /**
        intercept方法参数说明：
            o ： 代理对象
            method ： 真实对象中的方法的Method实例
            args ： 实际参数
            methodProxy ：代理对象中的方法的method实例
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
        TrainStation result = (TrainStation) methodProxy.invokeSuper(o, objects);
        return result;
    }
}
