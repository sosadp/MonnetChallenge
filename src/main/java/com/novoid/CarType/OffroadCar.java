package com.novoid.CarType;

/**
 * Implementacion del OffroadCar parte del patron Abstract factory
 */

public class OffroadCar implements Car {

    @Override
    public void start() {
        System.out.println("OffroadCar mood is active");
    }

    @Override
    public void performFunction() {
        System.out.println("the function is OffroadCar");
    }
}
