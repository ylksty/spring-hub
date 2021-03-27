package com.ylkget.pattern.factory.factorymethod;

import com.ylkget.pattern.factory.factorymethod.order.BJOrderPizza;
import com.ylkget.pattern.factory.factorymethod.order.LDOrderPizza;

/**
 * <p>
 * PizzaStore
 * </p>
 *
 * @author joe 2021/3/27 17:20
 */
public class PizzaStore {
    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
        // TODO Auto-generated method stub
    }
}
