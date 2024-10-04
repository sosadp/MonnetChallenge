package com.novoid.strategy;

import com.novoid.CarStrategy;

public class RacingStrategy implements CarStrategy {
    @Override
    public void builtCar() {
        System.out.println("Use is racing");
    }
}
