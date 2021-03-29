package com.ylkget.pattern.factory.absfactory.pizzastore;

import com.ylkget.pattern.factory.absfactory.pizzastore.order.BJFactory;
import com.ylkget.pattern.factory.absfactory.pizzastore.order.OrderPizza;

/**
 * <p>
 * PizzaStore
 * </p>
 *
 * @author joe 2021/3/27 17:04
 */
public class PizzaStore {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        new OrderPizza(new LDFactory());
        new OrderPizza(new BJFactory());
    }
}
