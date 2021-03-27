package com.ylkget.pattern.factory.absfactory.pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 17:12
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的芝士pizza");
        System.out.println(" 伦敦的芝士pizza 准备原材料");
    }
}
