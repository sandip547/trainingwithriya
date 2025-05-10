package com.exosolve.questions;

public class CloudLogger extends Logger {
    @Override
    String logMessage(String message) {
        return "Cloud logging " + logFormat(message);
    }

    @Override
    String connect() {
        return "Cloud logger has been connected";
    }

    @Override
    String disconnect() {
        return "Cloud logger has been disconnected";
    }
}
