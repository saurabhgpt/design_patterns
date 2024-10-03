package com.saurgupta.design_patterns.Learning.Creational.Singleton;

public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance;
    private String data;

    private DoubleCheckedSingleton(String data) {
        this.data = data;
    }

    public static DoubleCheckedSingleton getInstance(String data) {
        DoubleCheckedSingleton result = instance;
        if(result == null) {
            synchronized (DoubleCheckedSingleton.class) {
                result = instance;
                if(result == null) {
                    result = new DoubleCheckedSingleton(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return data;
    }
}
