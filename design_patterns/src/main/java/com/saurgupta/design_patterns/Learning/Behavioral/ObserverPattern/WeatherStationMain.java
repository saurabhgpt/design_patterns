package com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern;

import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable.IObservable;
import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable.WeatherStationIObservable;
import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer.EmailWSObserver;
import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer.IObserver;
import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer.WeatherStationObserver;

public class WeatherStationMain {
    public static void main(String[] args) {
        IObservable<Double> iObservable = new WeatherStationIObservable();
        IObserver emailWSObserver = new EmailWSObserver("abc@xyz.in", iObservable);
        IObserver WSObserver = new WeatherStationObserver(iObservable);
        iObservable.add(emailWSObserver);
        iObservable.add(WSObserver);
        iObservable.setData(324.12);
    }
}
