package com.ylkget.pattern.builder.improve;

/**
 * <p>
 * HouseBuilder
 * </p>
 *
 * @author joe 2021/3/28 19:20
 */
// 抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }
}
