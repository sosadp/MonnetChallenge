package com.novoid.CarType.ConcreteFactory;

import com.novoid.CarFactory;
import com.novoid.CarType.Car;
import com.novoid.CarType.SecretAgentCar;

/**
 * Factory  SecretCarFactory parte del patron Abstract factory
 */

public class SecretCarFactory implements CarFactory {
    @Override
    public Car builtCar() {
        return new SecretAgentCar();
    }
}
