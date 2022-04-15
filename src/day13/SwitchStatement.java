package day13;

import java.util.Locale;
import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide which day is today : ");

        String today = scanner.nextLine();

        today = today.toLowerCase();

        switch (today) {
            case "sunday", "tuesday" -> System.out.println("Pizza");
            case "monday" -> System.out.println("Nuggets");
            case "thursday" -> System.out.println("Rice");
            case "friday" -> System.out.println("Chicken");
            default -> System.out.println("Fried Rice");
        }

        // for older version of java
//        switch (today){
//            case "sunday";
//                System.out.println("MOMOS");
//                break;
//            case "sunday";
//                System.out.println("MOMOS");
//                break;
//            case "sunday";
//                System.out.println("MOMOS");
//                break;
//            case "sunday";
//                System.out.println("MOMOS");
//                break;
//            case "sunday";
//                System.out.println("MOMOS");
//                break;
//            default: "sunday";
//                System.out.println("MOMOS");
//        }



    }
}
