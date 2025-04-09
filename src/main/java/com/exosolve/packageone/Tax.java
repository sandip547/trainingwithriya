package com.exosolve.packageone;

public class Tax {
    protected int taxId;
    double taxPercentage;

    protected int calculateTax(){

        return 6;
    }

    public int getTaxId() {
        return taxId;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }
}
