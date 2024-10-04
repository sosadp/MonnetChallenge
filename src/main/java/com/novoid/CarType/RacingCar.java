package com.novoid.CarType;

public class RacingCar implements Car {
    @Override
    public void start() {
        System.out.println("Racing");
    }

    @Override
    public void performFunction() {
        System.out.println("The function is Racing");
    }
}
