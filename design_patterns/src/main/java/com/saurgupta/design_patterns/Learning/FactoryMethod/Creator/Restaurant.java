package com.saurgupta.design_patterns.Learning.FactoryMethod.Creator;

import com.saurgupta.design_patterns.Learning.FactoryMethod.Product.IBurger;

public abstract class Restaurant {
    public IBurger orderBurger() {
        IBurger iBurger = createBurger();
        iBurger.prepare();
        return iBurger;
    }

    // factory method
    public abstract IBurger createBurger();


}
