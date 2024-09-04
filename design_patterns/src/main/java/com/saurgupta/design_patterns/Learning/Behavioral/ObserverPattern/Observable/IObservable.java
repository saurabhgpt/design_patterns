package com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable;

import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer.IObserver;

public interface IObservable<T> {
    void add(IObserver iObserver);
    void remove(IObserver iObserver);
    void notifyObserver(T data);
    void setData(T data);
    T getData();
}
