package com.exosolve.inheritance;

public class RunPayment {

    public static void main(String[] args) {

        Payment pay = new AdvancePayment(1,"RIYA");
        Payment payme = new Payment(1);

        System.out.println(payme.paymentversion);
        System.out.println(payme.getAmount());
        pay.initiatePayment();

        Payment payPayal = new PaypalPayment();
        AdvancePayment payment = new AdvancePayment(1,"riya123");
        payment.initiatePayment();
        System.out.println("PaymentId: " + payment.paymentId + "userName :" + payment.userName);
        payment.checkCredentials();
        payment.processPayment();
        payment.savePaymentInformation();

    }
}
