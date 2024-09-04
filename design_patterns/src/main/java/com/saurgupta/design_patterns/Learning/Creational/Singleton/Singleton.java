package com.saurgupta.design_patterns.Learning.Creational.Singleton;

public class Singleton {
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if(result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if(result == null) {
                    result = new Singleton(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return data;
    }
}
