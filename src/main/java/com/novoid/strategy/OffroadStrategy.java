package com.novoid.strategy;

import com.novoid.CarStrategy;

public class OffroadStrategy implements CarStrategy {
    @Override
    public void builtCar() {
        System.out.println("Use is offroad");

    }
}
