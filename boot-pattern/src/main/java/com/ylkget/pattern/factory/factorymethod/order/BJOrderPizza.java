package com.ylkget.pattern.factory.factorymethod.order;

import com.ylkget.pattern.factory.factorymethod.pizza.BJCheesePizza;
import com.ylkget.pattern.factory.factorymethod.pizza.BJPepperPizza;
import com.ylkget.pattern.factory.factorymethod.pizza.Pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 17:26
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
