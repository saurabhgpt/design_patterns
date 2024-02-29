package com.saurgupta.design_patterns.Learning.FactoryMethod.Creator;

import com.saurgupta.design_patterns.Learning.FactoryMethod.Product.BeefBurger;
import com.saurgupta.design_patterns.Learning.FactoryMethod.Product.IBurger;

public class BeefBurgerRestaurant extends Restaurant{
    @Override
    public IBurger createBurger() {
        BeefBurger beefBurger = new BeefBurger();
        System.out.println("BeefBurger is prepared");
        return beefBurger;
    }
}
