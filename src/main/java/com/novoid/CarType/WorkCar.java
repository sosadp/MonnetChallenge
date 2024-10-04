package com.novoid.CarType;

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
