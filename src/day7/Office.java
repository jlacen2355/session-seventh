package day7;

import java.util.Calendar;
import java.util.Date;

public class Office {
    //var i = 3; // Not be able to use var outside the function

    public static void main(String[] args) {

//        Employee employee = new Employee();
        var i = 3;
        Employee taman = new Employee("Taman", 30, 5000, Calendar.getInstance());
        System.out.println(taman.getName());
        System.out.println(taman.getAge());

        Employee james = new Employee("James", 32, 6000, Calendar.getInstance(), "458565");
        System.out.println(james.getName());
        System.out.println(james.getAge());

    }

}
