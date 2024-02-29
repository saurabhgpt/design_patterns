package com.saurgupta.design_patterns.Learning.BuilderPattern;

import com.saurgupta.design_patterns.Learning.BuilderPattern.Builders.CarBuilder;
import com.saurgupta.design_patterns.Learning.BuilderPattern.Builders.CarDirector;
import com.saurgupta.design_patterns.Learning.BuilderPattern.Builders.CarSchemaBuilder;

public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.model("Chiron");
        System.out.println(builder.build());

        CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
        director.buildLambo(schemaBuilder);
        System.out.println(schemaBuilder.build());
    }
}
