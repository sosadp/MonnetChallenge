package com.novoid.CarType.ConcreteFactory;

import com.novoid.CarFactory;
import com.novoid.CarType.Car;
import com.novoid.CarType.OffroadCar;

public class OffroadCarFactory implements CarFactory {
    @Override
    public Car builtCar() {
        return new OffroadCar();
    }
}
