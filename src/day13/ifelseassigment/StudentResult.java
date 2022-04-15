package day13.ifelseassigment;

import java.io.Console;
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        //The code commented above is just using console, if we use it here we are using IDE, and it doesn't go to work

        Console cons = System.console();

        System.out.println("Enter the userName");
        String userName= cons.readLine();
        System.out.println("Enter the password");
        char[] passwordArray=cons.readPassword();

        String password = String.valueOf(passwordArray);

        System.out.println(password);

        if(!password.equals("admin123")){
            System.out.println("You are not authenticated user. Please try again");
            System.exit(0);
        }


        System.out.println("Enter the full name of the student");
        String name=input1.nextLine();
        System.out.println("Enter marks in math");
        float math= input.nextFloat();
        System.out.println("Enter marks in science");
        float science= input.nextFloat();
        System.out.println("Enter marks in computer");
        float computer= input.nextFloat();
        System.out.println("Enter marks in english");
        float english= input.nextFloat();
        System.out.println("Enter marks in social Study");
        float socialStudy= input.nextFloat();
        float total=math+science+computer+english+socialStudy;
        float percentage=(total/500)*100;

        //System.out.println("the percentage of "+ name + " is " + percentage+" %");
//        String output = String.format("The percentage of %s is %.2f", name, percentage);  // this is the best way
//        System.out.println(output);


        if(percentage >= 90){
            System.out.println(String.format("%s obtain a %.2f percentage to get a grade of A (Pass)", name, percentage));
        }else if(percentage >= 80){
            System.out.println(String.format("%s obtain a %.2f percentage to get a grade of B (Pass)", name, percentage));
        }else if(percentage >= 70){
            System.out.println(String.format("%s obtain a %.2f percentage to get a grade of C (Evaluate)", name, percentage));
        }else if(percentage >= 60){
            System.out.println(String.format("%s obtain a %.2f percentage to get a grade of D (Fail)", name, percentage));
        }else {
            System.out.println(String.format("%s obtain a %.2f percentage to get a grade of F (Fail)", name, percentage));
        }

    }
}
