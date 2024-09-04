package com.saurgupta.design_patterns.Learning.Behavioral.StatePattern.States;

import com.saurgupta.design_patterns.Learning.Behavioral.StatePattern.Phone;

public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
}
