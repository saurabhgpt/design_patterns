package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.PaymentSystem;

import com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.PaymentSystem.Strategies.PaymentByCreditCard;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setiPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
    }
}
