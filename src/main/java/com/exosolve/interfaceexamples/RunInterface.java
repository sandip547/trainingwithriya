package com.exosolve.interfaceexamples;

import com.exosolve.service.SendEmail;
import com.exosolve.service.impl.GmailImpl;
import com.exosolve.service.impl.SesImpl;

public class RunInterface {
    public static void main(String[] args) {

        String templateOne ="=================================";
        String templateTwo = "********************************";
        SendEmail gmail = new GmailImpl();
        gmail.sendEmail("riya@gmail.com","sandip.@gmail.com","Problem","Can you plese guide me on interface");
        System.out.println();
        gmail.sendEmail("riya@gmail.com","sandip.@gmail.com","Problem","Can you plese guide me on abstract Class","Logger.java");
        System.out.println();
        gmail.sendEmail("riya@gmail.com","sandip.@gmail.com","Problem","Can you plese guide me on abstract Class","Logger.java",templateOne);

        System.out.println("\n");

        SendEmail ses = new SesImpl();
        ses.sendEmail("rohan@gmail.com","sandip.@gmail.com","Problem","Can you plese guide me on interface");
        System.out.println();
        ses.sendEmail("rohan@gmail.com","sandip.@gmail.com","Problem","Can you plese guide me on Inheritance Class","Inheritance.java");
        System.out.println();
        ses.sendEmail("rohan@gmail.com","sandip.@gmail.com","Problem","Can you plese guide me on abstract Class","Logger.java",templateTwo);
    }
}
