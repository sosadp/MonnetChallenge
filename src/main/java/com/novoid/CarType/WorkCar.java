package com.novoid.CarType;

/**
 * Implementacion del SecretAgentCar parte del patron Abstract factory
 */


public class WorkCar implements Car {

    @Override
    public void start() {
        System.out.println("WorkCar mood is active");
    }

    @Override
    public void performFunction() {
        System.out.println("the function is Work");
    }
}
