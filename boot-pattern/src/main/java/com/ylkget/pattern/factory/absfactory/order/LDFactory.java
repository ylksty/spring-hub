package com.ylkget.pattern.factory.absfactory.order;

import com.ylkget.pattern.factory.absfactory.pizza.LDCheesePizza;
import com.ylkget.pattern.factory.absfactory.pizza.LDPepperPizza;
import com.ylkget.pattern.factory.absfactory.pizza.Pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 17:05
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
