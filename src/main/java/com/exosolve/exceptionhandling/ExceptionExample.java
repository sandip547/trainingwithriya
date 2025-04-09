package com.exosolve.exceptionhandling;

public class ExceptionExample {

    public void divide() throws ArithmeticException,NullPointerException{
        int a = 5 / 0;
    }
    public static void main(String[] args) {
    try {
        new ExceptionExample().divide();

    }catch (ArithmeticException e){
        System.out.println(e.getMessage());
    }

//        try {
//
//
//
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("we are handling this exception :" + e.getMessage());
//        }

//        try {
//
//
//
//        }catch (ArithmeticException e){
//            System.out.println("we are handling this exception :"+ e.getMessage());
//        }
       System.out.println("Hello there i want to be executed");
    }

}
