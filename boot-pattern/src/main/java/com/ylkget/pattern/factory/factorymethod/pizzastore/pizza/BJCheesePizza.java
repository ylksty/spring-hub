package com.ylkget.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * <p>
 * BJCheesePizza
 * </p>
 *
 * @author joe 2021/3/27 17:24
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
