package com.novoid.CarType.ConcreteFactory;

import com.novoid.CarFactory;
import com.novoid.CarType.Car;
import com.novoid.CarType.WorkCar;

public class WorkCarFactory implements CarFactory {

    @Override
    public Car builtCar() {
        return new WorkCar();
    }
}
