package com.saurgupta.design_patterns.Learning.StrategyPattern;

import com.saurgupta.design_patterns.Learning.StrategyPattern.Strategies.IPaymentStrategy;

public class PaymentService {
    private int cost;
    private boolean includeDelivery;
    private IPaymentStrategy iPaymentStrategy;

    public void setiPaymentStrategy(IPaymentStrategy iPaymentStrategy) {
        this.iPaymentStrategy = iPaymentStrategy;
    }
    public void processOrder() {
        iPaymentStrategy.collectPaymentDetails();
        if(iPaymentStrategy.validatePaymentDetails()) {
            iPaymentStrategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}
