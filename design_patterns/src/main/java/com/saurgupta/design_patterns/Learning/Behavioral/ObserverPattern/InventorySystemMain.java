package com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern;

import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable.IObservable;
import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable.WareHouseObservable;
import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer.FrontStoresObserver;
import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer.IObserver;

public class InventorySystemMain {
    public static void main(String[] args) {
        IObservable<Inventory> iObservable = new WareHouseObservable();
        IObserver frontStoreObserver1 = new FrontStoresObserver(iObservable);
        IObserver frontStoreObserver2 = new FrontStoresObserver(iObservable);
        IObserver frontStoreObserver3 = new FrontStoresObserver(iObservable);
        iObservable.add(frontStoreObserver1);
        iObservable.add(frontStoreObserver2);
        iObservable.add(frontStoreObserver3);
        iObservable.setData(new Inventory(InventoryItemType.BEVERAGE, 3));
        iObservable.setData(new Inventory(InventoryItemType.FOOD, 1));
        iObservable.setData(new Inventory(InventoryItemType.MEDICINE, 2));
        iObservable.setData(new Inventory(InventoryItemType.MEDICINE, 3));
        iObservable.setData(new Inventory(InventoryItemType.BEVERAGE, 5));
        iObservable.setData(new Inventory(InventoryItemType.MEDICINE, 4));
        iObservable.setData(new Inventory(InventoryItemType.FOOD, 2));
    }
}
