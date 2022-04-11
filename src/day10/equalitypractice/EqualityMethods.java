package day10.equalitypractice;

import java.util.logging.Logger;

public class EqualityMethods {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hi";
        String c = "Hello";

        //Method #1
        System.out.println(a.equals(b)); // response will be false

        //Method #2
        System.out.println("Hello".equals(c)); // response will be true

        //Method #3
        System.out.println("Hello".equalsIgnoreCase("hello")); // response will be true

        //Method #4
        System.out.println(a == b); // response will be false



    }


}
