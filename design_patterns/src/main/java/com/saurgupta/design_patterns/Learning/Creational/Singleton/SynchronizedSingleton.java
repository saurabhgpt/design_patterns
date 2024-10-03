package com.saurgupta.design_patterns.Learning.Creational.Singleton;

public class SynchronizedSingleton {
    static SynchronizedSingleton synchronizedSingleton;

    private SynchronizedSingleton() {
    }

    @SuppressWarnings("InstantiationOfUtilityClass")
    synchronized public static SynchronizedSingleton getSynchronizedSingleton() {
        if(synchronizedSingleton == null) {
            synchronizedSingleton = new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }
}
