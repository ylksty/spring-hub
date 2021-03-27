package com.ylkget.pattern.factory.factorymethod.order;

import com.ylkget.pattern.factory.factorymethod.pizza.LDCheesePizza;
import com.ylkget.pattern.factory.factorymethod.pizza.LDPepperPizza;
import com.ylkget.pattern.factory.factorymethod.pizza.Pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 17:30
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
