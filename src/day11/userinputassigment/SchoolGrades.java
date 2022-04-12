package day11.userinputassigment;

import java.util.Scanner;

public class SchoolGrades {

    public static void main(String[] args) {

        Scanner studentInput = new Scanner(System.in);          // Declare a scanner object

        System.out.println("Enter your name : ");
        String name = studentInput.nextLine();

        System.out.println("Enter your grades in points (number) for every School Class: Example english --> 90");

        System.out.println("Enter grade for Math");
        float avgGrade = studentInput.nextInt();

        System.out.println("Enter grade for Science");
        avgGrade += studentInput.nextInt();

        System.out.println("Enter grade for English");
        avgGrade += studentInput.nextInt();

        System.out.println("Enter grade for History");
        avgGrade += studentInput.nextInt();

        System.out.println("Enter grade for Chemistry");
        avgGrade += studentInput.nextInt();

        //Option #1
        avgGrade /= 500;
        avgGrade *= 100;

//        Option #2
//        avgGrade = (avgGrade /500)*100;


        System.out.println(name + " 'your average grade is --> " + String.format("%.2f", avgGrade) + "%'");
        System.out.println("------------------------------------------------");



    }

}
