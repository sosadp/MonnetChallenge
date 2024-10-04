package com.novoid.strategy;

import com.novoid.CarFactory;
import com.novoid.CarStrategy;
import com.novoid.CarType.Car;

public class OffroadStrategy implements CarStrategy {

    @Override
    public void useCar(CarFactory carFactory) {
       Car car1 = carFactory.builtCar();
       car1.start();
       car1.performFunction();
        System.out.println("Use is offroad");
    }
}
