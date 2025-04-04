package com.exosolve.service;

import java.io.File;
import java.util.List;

public interface SendEmail {

    void sendEmail(String to,String from,String subject,String message);
    void sendEmail(String to, String from, String subject, String message, String attachment);

    void sendEmail(String to,String from,String subject,String message,String attachment,String template);



}
