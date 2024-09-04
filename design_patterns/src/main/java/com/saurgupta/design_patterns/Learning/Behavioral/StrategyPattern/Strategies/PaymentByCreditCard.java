package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.Strategies;

import com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.CreditCard;

public class PaymentByCreditCard implements IPaymentStrategy {
    private CreditCard card;
    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("number", "date", "cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using credit card");
    }
}
