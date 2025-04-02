package com.exosolve.packageone;

import java.io.File;
import java.util.List;

public class SendEmail {

    String sendEmail(List<String> to,String message,String from){
        return "mail sent";
    }

    String sendEmail(List<String> to, String message, String from, List<File> attachments){
        return "mail sent with attachments";
    }

    public static void main(String[] args) {
      //  Employee employeeOne = new Employee();
        Employee employee = new Employee(1,"Riya");
    }
}
