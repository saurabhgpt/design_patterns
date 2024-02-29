package com.saurgupta.design_patterns.Learning.ObserverPattern.Listeners;

public class EmailMsgListener implements IEventListener {
    private final String userName;

    public EmailMsgListener(String userName) {
        this.userName = userName;
    }

    @Override
    public void update() {

    }
}
