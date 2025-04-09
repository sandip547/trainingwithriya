package com.exosolve.exceptionhandling;

public class StaticExample {
    public static String config;
    static {
        config = "Hello00000";
        System.out.println(config);
    }
    StaticExample(int a){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new StaticExample(6);
    }

}
