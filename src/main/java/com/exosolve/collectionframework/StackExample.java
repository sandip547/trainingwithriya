package com.exosolve.collectionframework;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> textUndo = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i<100;i++){

            String saveInput = scanner.next();
            System.out.println(saveInput);
            if (saveInput.equals("exit")){
                break;
            }
            if(saveInput.equals("undo")){
                textUndo.pop();
            }else {
                textUndo.push(saveInput);
            }

        }
        System.out.println(textUndo);


//        loc.push("kathmandu");
//        loc.push("london");
//        loc.push("mexico");
//        loc.push("japan");
//        loc.push("vatican city");
//
////        System.out.println(loc.pop());
////        System.out.println(loc);
////
////        System.out.println(loc.peek());
////
////        System.out.println(loc.search("japan"));
////
////        System.out.println(loc.empty());
//
//        while (!loc.isEmpty()){
//            System.out.println(loc.pop());
//        }
//        System.out.println(loc);



    }
}
