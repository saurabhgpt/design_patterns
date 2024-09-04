package com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Creator;

import com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Product.IBurger;
import com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Product.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant{
    @Override
    public IBurger createBurger() {
        VeggieBurger veggieBurger = new VeggieBurger();
        System.out.println("VeggieBurger is prepared");
        return veggieBurger;
    }
}
