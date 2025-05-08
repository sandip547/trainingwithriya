package com.exosolve.designpatterns;

public class SingltonExample {
    private static SingltonExample se;

    private SingltonExample(){

    }
    public static SingltonExample getInstance(){
        if(se == null){
            se = new SingltonExample();
        }
        return se;
    }
}
