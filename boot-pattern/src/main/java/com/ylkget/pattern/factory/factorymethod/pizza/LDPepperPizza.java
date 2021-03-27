package com.ylkget.pattern.factory.factorymethod.pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 17:30
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
