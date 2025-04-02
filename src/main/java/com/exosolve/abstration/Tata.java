package com.exosolve.abstration;

public class Tata extends Car{
    @Override
    boolean brake(int speed) {
        if (speed <15) return true;
        return false;
    }

    @Override
    String getBrandName(String name) {
        return name;
    }

    @Override
    String getLogo(String Logo) {
        return Logo;
    }
}
