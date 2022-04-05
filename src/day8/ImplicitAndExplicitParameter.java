package day8;


import java.util.Calendar;

public class ImplicitAndExplicitParameter {

    public static void main(String[] args) {

        Employee taman = new Employee("Taman Neupane", 30, 5000, Calendar.getInstance());
        Employee james = new Employee("James", 32, 6000, Calendar.getInstance(), "458565");

        taman.setEmployeeCount(10);
        Employee.setEmployeeCount(20);

        Employee.anyField = 0;


        System.out.println(Employee.getEmployeeCount());

//        taman.fireEmployee();





    }

}
