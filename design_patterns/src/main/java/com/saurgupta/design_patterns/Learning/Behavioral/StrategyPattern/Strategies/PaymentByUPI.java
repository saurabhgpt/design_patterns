package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.Strategies;

public class PaymentByUPI implements IPaymentStrategy {
    private String pin;

    @Override
    public void collectPaymentDetails() {
        pin = "pin";
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using UPI");
    }
}
