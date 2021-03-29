package com.ylkget.pattern.factory.absfactory.pizzastore.order;

import com.ylkget.pattern.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.ylkget.pattern.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.ylkget.pattern.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 19:48
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
