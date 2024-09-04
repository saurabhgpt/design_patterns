package com.saurgupta.design_patterns.Learning.Behavioral.StatePattern.States;

import com.saurgupta.design_patterns.Learning.Behavioral.StatePattern.Phone;

public abstract class State {
    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();
    public abstract String onOffOn();
}
