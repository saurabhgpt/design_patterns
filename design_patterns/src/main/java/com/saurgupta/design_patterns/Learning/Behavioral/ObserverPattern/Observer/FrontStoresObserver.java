package com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer;

import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Inventory;
import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable.IObservable;

public class FrontStoresObserver implements IObserver{
    IObservable iObservable;

    public FrontStoresObserver(IObservable iObservable) {
        this.iObservable = iObservable;
    }

    @Override
    public void updateData() {
        Inventory inventory = (Inventory)iObservable.getData();
        System.out.println(inventory.getInventoryItemType() + " - " + inventory.getUnits());
    }
}
