package com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Creator;

import com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Product.BeefBurger;
import com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Product.IBurger;

public class BeefBurgerRestaurant extends Restaurant{
    @Override
    public IBurger createBurger() {
        BeefBurger beefBurger = new BeefBurger();
        System.out.println("BeefBurger is prepared");
        return beefBurger;
    }
}
