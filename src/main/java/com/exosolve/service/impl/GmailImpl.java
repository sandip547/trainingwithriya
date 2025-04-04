package com.exosolve.service.impl;

import com.exosolve.service.SendEmail;

public class GmailImpl implements SendEmail {
    private final int portNumber = 588;
    @Override
    public void sendEmail(String to, String from, String subject, String message) {
        System.out.println("To : " + to);
        System.out.println("From : "+ from);
        System.out.println("Subject : " + subject);
        System.out.println("Message : "+ message);
        emailFormatMessage();
    }

    @Override
    public void sendEmail(String to, String from, String subject, String message, String attachment) {
        System.out.println("To : " + to);
        System.out.println("From : "+ from);
        System.out.println("Subject : " + subject);
        System.out.println("Message : "+ message);
        System.out.println("Attachment: "+ attachment);
        emailFormatMessage();
    }

    @Override
    public void sendEmail(String to, String from, String subject, String message, String attachment, String template) {
        System.out.println("To : " + to);
        System.out.println("From : "+ from);
        System.out.println("Subject : " + subject);
        System.out.println("Message : "+ message);
        System.out.println("Attachment: "+ attachment);
        System.out.println( template);
        emailFormatMessage();


    }

    private void emailFormatMessage(){
        System.out.println("PortNumber :" + this.portNumber);
        System.out.println("Mail has bee sent from Gmail : Google");
    }
}
