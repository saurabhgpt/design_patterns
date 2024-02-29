package com.saurgupta.design_patterns.Learning.StatePattern.States;

import com.saurgupta.design_patterns.Learning.StatePattern.Phone;

public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
