package com.exosolve.abstration;

public abstract class Car {

    void drive(){
        System.out.println("lets drive");
    }

    abstract boolean brake(int speed);

    abstract String getBrandName(String name);


    abstract String getLogo(String Logo);
}
