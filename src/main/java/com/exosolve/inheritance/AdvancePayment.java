package com.exosolve.inheritance;

public class AdvancePayment extends Payment{

    String userName;

    public AdvancePayment(int paymentId,String userName) {

        super.paymentversion =2;
        this.userName = userName;
    }

    void initiatePayment(){
        System.out.println("payment has been initiated for AdvancePayment");
    }

    void savePaymentInformation(){
        System.out.println("Information has been saved");
    }
}
