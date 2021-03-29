package com.ylkget.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 17:31
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
