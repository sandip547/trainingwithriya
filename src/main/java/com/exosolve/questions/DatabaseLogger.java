package com.exosolve.questions;

public class DatabaseLogger extends Logger {
    @Override
    String logMessage(String message) {
        return "Database logging " + logFormat(message);
    }

    @Override
    String connect() {
        return "Database logger has been connected";
    }

    @Override
    String disconnect() {
        return "Database logger has been disconnected";
    }
}
