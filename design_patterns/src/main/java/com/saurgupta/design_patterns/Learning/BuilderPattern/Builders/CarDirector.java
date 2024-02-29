package com.saurgupta.design_patterns.Learning.BuilderPattern.Builders;

public class CarDirector {
    public void buildBugatti(IBuilder iBuilder) {
        iBuilder.brand("Bugatti")
                .color("Blue")
                .model("veyron");
    }

    public void buildLambo(IBuilder iBuilder) {
        iBuilder.brand("Bugatti")
                .color("Blue")
                .model("aventador");
    }
}
