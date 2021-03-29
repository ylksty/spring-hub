package com.ylkget.pattern.factory.simplefactory.pizzastore.order;

import com.ylkget.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.ylkget.pattern.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.ylkget.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/28 10:14
 */
public class SimpleFactory {
    //简单工厂模式 也叫 静态工厂模式

    public static Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
