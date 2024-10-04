package com.novoid.CarType.ConcreteFactory;

import com.novoid.CarFactory;
import com.novoid.CarType.Car;
import com.novoid.CarType.WorkCar;

/**
 * Factory WorkCarFactory parte del patron Abstract factory
 */

public class WorkCarFactory implements CarFactory {

    @Override
    public Car builtCar() {
        return new WorkCar();
    }
}
