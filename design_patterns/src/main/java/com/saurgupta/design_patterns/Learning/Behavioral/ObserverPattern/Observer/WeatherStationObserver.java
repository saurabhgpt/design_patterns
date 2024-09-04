package com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer;

import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable.IObservable;

public class WeatherStationObserver implements IObserver{
    IObservable iObservable;
    double temperature;
    public WeatherStationObserver(IObservable iObservable) {
        this.iObservable = iObservable;
        this.temperature = 0;
    }

    @Override
    public void updateData() {
        this.temperature = (double) iObservable.getData();
        displayData();
    }

    private void displayData() {
        System.out.println(temperature);
    }
}
