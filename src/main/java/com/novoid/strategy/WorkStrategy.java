package com.novoid.strategy;

import com.novoid.CarFactory;
import com.novoid.CarStrategy;
import com.novoid.CarType.Car;

/**
 * Implementacion del WorkStrategy parte del patron Strategy
 */

public class WorkStrategy implements CarStrategy {

    @Override
    public void useCar(CarFactory carFactory) {

        Car car = carFactory.builtCar();
        car.start();
        car.performFunction();
        System.out.println("Use is work");
    }
}
