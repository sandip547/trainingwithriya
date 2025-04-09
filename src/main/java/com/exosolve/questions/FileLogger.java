package com.exosolve.questions;

public class FileLogger extends Logger {
    @Override
    String logMessage(String message) {
        return "File logging " + logFormat(message);
    }

    @Override
    String connect() {
        return "File logger has been connected";
    }

    @Override
    String disconnect() {
        return "File logger has been disconnected";
    }
}
