package com.exosolve.packageone;

public class Example {

    String name;

    // accessmodifier returntype methodname()  -- methods with param  and method without param
     String welcomeMessage(String name,String subject){
         return "Hello " + name +" welcome to the " +subject +" training";
     }

     String welcomeMessage(String name,String subject,String greetings){
         return greetings +" Name: "+  name + " Course :" + subject;
     }


    public Example(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Example e = new Example("Riya");
        Example e1 = new Example("Sandip");


//        System.out.println(e.welcomeMessage("Riya","Python"));
//        System.out.println(e.welcomeMessage("John","C++"));
//        System.out.println(e.welcomeMessage("Rahul","Java","Hi, welcome"));


    }
}
