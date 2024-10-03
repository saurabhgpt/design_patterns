package com.saurgupta.design_patterns.Learning.Creational.Singleton;

public class EagerSingleton {
    static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}
