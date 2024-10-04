package com.novoid.strategy;

import com.novoid.CarStrategy;

public class SecretAgencyStrategy implements CarStrategy {
    @Override
    public void builtCar() {
        System.out.println("Use is Secret Agent");
        camouflage();
        fireArmWeapons();
    }

    private void camouflage(){
        System.out.println("camouflage is active");
    }

    private void fireArmWeapons(){
        System.out.println("Arm weapon is active");
    }
}
