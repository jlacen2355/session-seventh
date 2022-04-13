package day12.usernameandpassword;

import java.io.Console;
import java.util.Scanner;

public class UsernameAndPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Console console = System.console();

        System.out.println("Administrator:");
        String userName= console.readLine();
        System.out.println("Password");
        char[] passwordArray=console.readPassword();
        String password = String.valueOf(passwordArray);

        if(!password.equals("admin2022")){
            System.out.println("You are not authenticated user. Please try again");
            System.exit(0);
        }
        else {
            System.out.println(String.format("Welcome %s !!!", userName));
            System.out.println("System is ready to operate...");
        }
    }

}
