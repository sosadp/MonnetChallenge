package com.novoid;

public class CarContext {

    private CarStrategy strategy;

    public void setCarStrategy(CarStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy (){
        this.strategy.builtCar();
    }
}
