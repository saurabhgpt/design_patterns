package com.saurgupta.design_patterns.Learning.Creational.Singleton;

public class LazySingleton {
    static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    @SuppressWarnings("InstantiationOfUtilityClass")
    public static LazySingleton getLazySingleton() {
        if(lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }
}
