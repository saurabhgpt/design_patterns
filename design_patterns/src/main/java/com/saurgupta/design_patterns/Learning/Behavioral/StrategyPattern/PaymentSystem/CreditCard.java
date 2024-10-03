package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.PaymentSystem;

public class CreditCard {
    private int amount = 1000;
    private final String number, date, cvv;

    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }
}
