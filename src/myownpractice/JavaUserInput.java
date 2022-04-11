package myownpractice;

import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {

        Scanner employeeAnswer = new Scanner(System.in);   //El System.in ayuda a leer la information obtenida del usuario
        System.out.println("Enter Username");

        String employeeUsername = employeeAnswer.nextLine();  // Esta linea de codigo lee strings en el que el usuario entra la data
        System.out.println("Your username to login is: " +employeeUsername);

        System.out.println("Now provide us your name, current department, age and payrate:");

        String employeeName = employeeAnswer.nextLine();
        String employeeDepartment = employeeAnswer.nextLine();
        int employeeAge = employeeAnswer.nextInt();
        double employeePayrate = employeeAnswer.nextDouble();


        System.out.println("User --> " + employeeUsername + " has name of '" + employeeName + "'");
        System.out.println("Employee age is around --> " + employeeAge);
        System.out.println("Employee current department --> " + employeeDepartment);
        System.out.println("The estimated pay rate for this employee --> $" + employeePayrate);

    }
}
