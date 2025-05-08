package com.exosolve.designpatterns;

public class SingltonCall {
    public static void main(String[] args) {
        SingltonExample ser = SingltonExample.getInstance();
        System.out.println(System.identityHashCode(ser));
        SingltonExample serone = SingltonExample.getInstance();
        System.out.println(System.identityHashCode(serone));



    }
}
