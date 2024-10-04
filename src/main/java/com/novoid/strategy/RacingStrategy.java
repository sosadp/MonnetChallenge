package com.novoid.strategy;

import com.novoid.CarFactory;
import com.novoid.CarStrategy;
import com.novoid.CarType.Car;

public class RacingStrategy implements CarStrategy {

    @Override
    public void useCar(CarFactory carFactory) {
        Car car = carFactory.builtCar();
        car.start();
        car.performFunction();
        System.out.println("Use is racing");
    }
}
