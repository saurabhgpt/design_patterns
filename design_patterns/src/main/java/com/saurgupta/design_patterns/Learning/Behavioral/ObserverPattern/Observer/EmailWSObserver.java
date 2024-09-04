package com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observer;

import com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern.Observable.IObservable;

public class EmailWSObserver implements IObserver {
    IObservable iObservable;
    String email;
    double temperature;

    public EmailWSObserver(String email, IObservable iObservable) {
        this.iObservable = iObservable;
        this.email = email;
    }

    @SuppressWarnings("CallToPrintStackTrace")
    @Override
    public void updateData() {
        try {
            if((double) iObservable.getData() == temperature) return;
            temperature = (double) iObservable.getData();
            sendEmail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendEmail() {
        System.out.println("Data sent over email");
    }
}
