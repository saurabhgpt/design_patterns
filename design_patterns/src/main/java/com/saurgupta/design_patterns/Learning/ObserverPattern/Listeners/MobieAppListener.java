package com.saurgupta.design_patterns.Learning.ObserverPattern.Listeners;

public class MobieAppListener implements IEventListener {
    private final String userName;

    public MobieAppListener(String userName) {
        this.userName = userName;
    }


    @Override
    public void update() {

    }
}
