package com.ylkget.pattern.behavior.strategy.pay.strategies;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/31 08:11
 */
public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
