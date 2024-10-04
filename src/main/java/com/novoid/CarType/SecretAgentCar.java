package com.novoid.CarType;

public class SecretAgentCar implements Car {


    @Override
    public void start() {
        System.out.println("Secret Agent mood is active");
    }

    @Override
    public void performFunction() {
        firearmWeapons();
        camouflage();
        System.out.println("the function is Secret Agent");
    }

    public void firearmWeapons(){
        System.out.println("Fire Weapon active");
    }

    public void camouflage(){
        System.out.println("Camouflage active");
    }


}
