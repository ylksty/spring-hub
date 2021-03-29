package com.ylkget.pattern.factory.simplefactory.pizzastore.order;

import com.ylkget.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/28 10:12
 */
public class OrderPizza {
    Pizza pizza = null;
    String orderType = "";
    // 构造器
    public OrderPizza() {

        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza(orderType);

            // 输出pizza
            if (pizza != null) { // 订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
