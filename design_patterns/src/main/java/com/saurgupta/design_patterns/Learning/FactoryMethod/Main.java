package com.saurgupta.design_patterns.Learning.FactoryMethod;

import com.saurgupta.design_patterns.Learning.FactoryMethod.Creator.BeefBurgerRestaurant;
import com.saurgupta.design_patterns.Learning.FactoryMethod.Creator.Restaurant;
import com.saurgupta.design_patterns.Learning.FactoryMethod.Creator.VeggieBurgerRestaurant;
import com.saurgupta.design_patterns.Learning.FactoryMethod.Product.IBurger;

public class Main {
    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        IBurger iBeefBurger = beefResto.orderBurger();

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        IBurger iVeggieBurger = veggieResto.orderBurger();
    }
}
