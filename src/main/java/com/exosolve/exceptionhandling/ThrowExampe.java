package com.exosolve.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExampe {


    public void validate(int a) throws CustomException {


        if(a==5){
            throw new CustomException("This is a exception for value 5");
        }else {
            System.out.println("The info is valid");
        }
    }
    public static void main(String[] args) {
        File f;
        FileInputStream fileInputStream = null;
        try {
            f = new File("hello.txt");
            try {
                fileInputStream = new FileInputStream(f);

                new ThrowExampe().validate(7);

            } catch (FileNotFoundException e) {
                System.out.println("we have caught the exception that has been thrown by fileinputstream");
            }
        }catch (NullPointerException | CustomException nullPointerException){
            System.out.println(nullPointerException.getMessage());
        }finally {

            System.out.println("This is finally block");
        }

    }
}
