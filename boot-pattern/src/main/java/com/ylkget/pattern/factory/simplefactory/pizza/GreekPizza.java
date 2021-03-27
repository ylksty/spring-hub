package com.ylkget.pattern.factory.simplefactory.pizza;

/**
 * <p>
 * GreekPizza
 * </p>
 *
 * @author joe 2021/3/27 15:49
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
