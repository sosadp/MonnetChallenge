package com.novoid.strategy;

import com.novoid.CarStrategy;
import lombok.extern.slf4j.Slf4j;


public class WorkStrategy implements CarStrategy {
    @Override
    public void builtCar() {
        System.out.println("Use is work");
    }
}
