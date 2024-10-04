package com.novoid;

import com.novoid.CarType.Car;

/**
 * Interface para establecer la construccion de objetos del patron Abstract factory
 */


public interface CarFactory {
    Car builtCar();
}
