package com.ylkget.pattern.factory.simplefactory;

import com.ylkget.pattern.factory.simplefactory.order.OrderPizza2;

/**
 * <p>
 * PizzaStore
 * </p>
 *
 * @author joe 2021/3/27 15:44
 */
public class PizzaStore {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        new OrderPizza();

        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("~~退出程序~~");

        new OrderPizza2();
    }

}
