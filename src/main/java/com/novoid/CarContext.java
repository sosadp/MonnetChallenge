package com.novoid;

public class CarContext {

    private CarStrategy strategy;

    public void setCarStrategy(CarStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy (CarFactory carFactory){
        this.strategy.useCar(carFactory);
    }
}
