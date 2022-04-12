package day11;

import java.util.Scanner;

public class UserCLIInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter any number you like : ");
        int userInput = scanner.nextInt();

        System.out.println(name + " Ok you have type : " + userInput);


    }
}
