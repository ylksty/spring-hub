package com.ylkget.pattern.factory.absfactory.pizza;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/27 19:49
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
