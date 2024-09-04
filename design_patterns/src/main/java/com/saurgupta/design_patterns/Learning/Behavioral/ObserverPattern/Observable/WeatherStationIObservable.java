package com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable;

import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer.IObserver;

import java.util.HashSet;
import java.util.Set;

public class WeatherStationIObservable implements IObservable {
    Set<IObserver> observerSet = new HashSet<>();
    double temperature;
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
            if((double) data == temperature) return;

            this.temperature = (double) data;
            notifyObserver(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getData() {
        return temperature;
    }
}
