package com.novoid;

public class Singleton{

    private  final String instance;

    private String name;
    private Singleton(String instance) {
        this.instance = instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
