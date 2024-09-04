package com.saurgupta.design_patterns.Learning.Creational.FactoryMethod;

import com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Creator.BeefBurgerRestaurant;
import com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Creator.Restaurant;
import com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Creator.VeggieBurgerRestaurant;
import com.saurgupta.design_patterns.Learning.Creational.FactoryMethod.Product.IBurger;

public class Main {
    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        IBurger iBeefBurger = beefResto.orderBurger();

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        IBurger iVeggieBurger = veggieResto.orderBurger();
    }
}
