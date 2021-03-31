package com.ylkget.pattern.behavior.strategy.pay.strategies;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/31 08:06
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
