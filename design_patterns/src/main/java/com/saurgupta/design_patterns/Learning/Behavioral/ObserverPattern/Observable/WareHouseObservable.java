package com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable;

import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Inventory;
import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer.IObserver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WareHouseObservable implements IObservable{
    Set<IObserver> observerSet = new HashSet<>();
    List<Inventory> inventoryList = new ArrayList<>();
    @Override
    public void add(IObserver iObserver) {
        observerSet.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {
        observerSet.remove(iObserver);
    }

    @Override
    public void notifyObserver(Object data) {
        observerSet.forEach(IObserver::updateData);
    }

    @SuppressWarnings("CallToPrintStackTrace")
    @Override
    public void setData(Object data) {
        try {
            inventoryList.add((Inventory) data);
            notifyObserver(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getData() {
        return inventoryList.get(inventoryList.size() - 1);
    }
}
