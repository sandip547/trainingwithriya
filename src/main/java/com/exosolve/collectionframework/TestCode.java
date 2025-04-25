package com.exosolve.collectionframework;

public class TestCode {
    
    public Request doRequest(Request r){
        System.out.println("Parent");
        return r;
    }
}

class TestNew extends TestCode{
    public Request doRequest(Request r){
        System.out.println(r.getId());

        return r;
    }

}

class A{
    public static void main(String[] args) {
        Request r = new Request();
        r.setId(45);
        System.out.println(new TestNew().doRequest(new TestCode().doRequest(r)));
    }
}
