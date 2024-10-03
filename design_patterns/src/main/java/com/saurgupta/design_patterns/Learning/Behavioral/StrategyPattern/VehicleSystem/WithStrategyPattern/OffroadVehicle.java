package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern;

import com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern.Strategy.DriveStrategy;
import com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
