package com.ylkget.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 17:27
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
