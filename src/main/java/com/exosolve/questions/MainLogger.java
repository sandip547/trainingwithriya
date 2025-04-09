package com.exosolve.questions;

public class MainLogger {

    public static void main(String[] args) {
        Logger fileLogger = new FileLogger();
        System.out.println(fileLogger.connect());
        System.out.println(fileLogger.logMessage("File logger entry"));
        System.out.println(fileLogger.logMessage("File logger entry"));
        System.out.println("\n");

        Logger cloudLogger = new CloudLogger();
        System.out.println(cloudLogger.connect());
        System.out.println(cloudLogger.logMessage("Cloud logger entry"));
        System.out.println(cloudLogger.disconnect());
        System.out.println("\n");

        Logger databaseLogger = new DatabaseLogger();
        System.out.println(databaseLogger.connect());
        System.out.println(databaseLogger.logMessage("Database logger entry"));
        System.out.println(databaseLogger.disconnect());
    }
}
