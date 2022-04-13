package day11.userinputassigment;

import java.util.Scanner;

public class SchoolGrades {

    public static void main(String[] args) {

        Scanner studentInput = new Scanner(System.in);          // Declare a scanner object

        System.out.println("Enter your name : ");
        String name = studentInput.nextLine();

        System.out.println("Enter your grades in points (number) for every School Class: Example english --> 90");

        System.out.println("Enter grade for Math");
        float math = studentInput.nextFloat();

        System.out.println("Enter grade for Science");
        float science = studentInput.nextFloat();

        System.out.println("Enter grade for English");
        float english = studentInput.nextFloat();

        System.out.println("Enter grade for History");
        float history = studentInput.nextFloat();

        System.out.println("Enter grade for Chemistry");
        float chemistry = studentInput.nextFloat();


        float avgGrade = (math + science + english + history + chemistry)/5;


        System.out.println(name + " 'your average grade is --> " + String.format("%.2f", avgGrade) + "%'");
        System.out.println("------------------------------------------------");



    }

}
