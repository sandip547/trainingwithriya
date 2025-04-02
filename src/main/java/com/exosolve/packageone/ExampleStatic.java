package com.exosolve.packageone;

public class ExampleStatic {

    static  int a;

    static {
        a = 50;
        System.out.println(a);
    }

    public ExampleStatic(){
        System.out.println("Hello there");
    }

    public static void main(String[] args) {
        ExampleStatic exampleStatic = new ExampleStatic();
//        System.out.println("hthere there");

    }
}
