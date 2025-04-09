package com.exosolve.abstration;

import com.exosolve.exceptionhandling.StaticExample;

public class DriveCar {
    public static void main(String[] args) {
        Car bmw= new Bmw();
        bmw.drive();
        System.out.println(bmw.getBrandName("BMW"));
        System.out.println(StaticExample.config);
        bmw.getLogo("**bmw**");

        Car tata = new Tata();
        tata.drive();
        tata.getBrandName("Tata");
        tata.getLogo("&&tata&&");
    }
}
