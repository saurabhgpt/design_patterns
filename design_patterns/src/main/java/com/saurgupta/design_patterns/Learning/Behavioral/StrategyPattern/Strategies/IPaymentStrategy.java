package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.Strategies;

public interface IPaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}
