package com.novoid.CarType.ConcreteFactory;

import com.novoid.CarFactory;
import com.novoid.CarType.Car;
import com.novoid.CarType.RacingCar;

/**
 * Factory  RacingCarFactory parte del patron Abstract factory
 */

public class RacingCarFactory implements CarFactory {

    @Override
    public Car builtCar() {
        return new RacingCar();
    }
}
