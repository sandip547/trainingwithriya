package com.exosolve.abstration;

public class Bmw extends Car{
    @Override
    boolean brake(int speed) {
        if(speed < 10) return true;
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
