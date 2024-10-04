package com.novoid.strategy;

import com.novoid.CarFactory;
import com.novoid.CarStrategy;
import com.novoid.CarType.Car;


public class WorkStrategy implements CarStrategy {

    @Override
    public void execute(CarFactory carFactory) {

        Car car = carFactory.builtCar();
        car.start();
        car.performFunction();
        System.out.println("Use is work");
    }
}
