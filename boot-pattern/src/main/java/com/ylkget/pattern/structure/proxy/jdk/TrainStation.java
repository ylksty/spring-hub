package com.ylkget.pattern.structure.proxy.jdk;

/**
 * <p>
 * TrainStation
 * </p>
 *
 * @author joe 2021/4/9 14:06
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
