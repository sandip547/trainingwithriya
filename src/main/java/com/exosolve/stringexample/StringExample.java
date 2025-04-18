package com.exosolve.stringexample;

public class StringExample {
    public static void main(String[] args) {
        String name="riya";

        //name = "riyan";
        String nameOne = "riya";

        String sOne = new String("San");
        String sTwo = new String("San");


        System.out.println(sOne==sTwo);
        System.out.println(name==nameOne);

        System.out.println(sOne.equals(sTwo));
        System.out.println(name.equals(nameOne));

        System.out.println(name);

        //not thread safe
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("riya");
        stringBuilder.append("hello");

        // t1, t2,  t3

        System.out.println(stringBuilder);

        //thread safe
        StringBuffer stringBuffer = new StringBuffer();
    }
}
