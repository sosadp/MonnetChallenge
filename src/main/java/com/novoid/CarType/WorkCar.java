package com.novoid.CarType;

public class WorkCar implements Car {

    @Override
    public void start() {
        System.out.println("WorkCar");
    }

    @Override
    public void performFunction() {
        System.out.println("the function is Work");
    }
}
