package com.ylkget.pattern.factory.absfactory.pizzastore.pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 19:50
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的芝士pizza");
        System.out.println(" 北京的芝士pizza 准备原材料");
    }
}
