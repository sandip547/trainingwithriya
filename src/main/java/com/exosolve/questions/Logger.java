package com.exosolve.questions;

public abstract class Logger {

    final String logFormat(String message) {
        return "[LOG]: " + message;
    }

    abstract String logMessage(String message);
    abstract String connect();
    abstract String disconnect();

}
