package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.PaymentSystem.Strategies;

public interface IPaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
