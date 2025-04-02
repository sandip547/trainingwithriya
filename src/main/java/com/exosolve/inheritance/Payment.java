package com.exosolve.inheritance;

public  class Payment {
    protected int paymentversion;
    public int paymentId;



    private int amount;

    MorePaymentDetails m;



    public Payment(){

    }

    public Payment(int paymentId){

        this.paymentId = paymentId;



    }

    private class MorePaymentDetails{

        private int amount;

        MorePaymentDetails(int amount){
            this.amount =amount;
        }

        public int getAmount() {
            return amount;
        }
    }


    public int getAmount() {
        return amount;
    }

   public int getPaymentversion() {
        return paymentversion;
    }

    public void setPaymentversion(int paymentversion) {
        this.paymentversion = paymentversion;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public MorePaymentDetails getM() {
        return m;
    }

    public void setM(MorePaymentDetails m) {
        this.m = m;
    }

    void initiatePayment(){
        System.out.println("payment has been initiated");
    }

    void checkCredentials(){
        System.out.println("Credentials verified");
    }

    void processPayment(){
        System.out.println("payment processed");
    }
}
