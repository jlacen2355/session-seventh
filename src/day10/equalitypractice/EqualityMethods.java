package day10.equalitypractice;

import java.util.logging.Logger;

public class EqualityMethods {

    public static void main(String[] args) {
        String a = "Hellow";
        String b = "Hi";
        String c = "Hellow";

        //Method #1
        System.out.println(a.equals(b)); // response will be false

        //Method #2
        System.out.println("Hellow".equals(c)); // response will be true

        //Method #3
        System.out.println("Hellow".equalsIgnoreCase("hellow")); // response will be true

        //Method #4
        System.out.println(a == b); // response will be false



    }


}
