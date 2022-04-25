package day19;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.ensureCapacity(100);

        strings.add("ABC");
        strings.add("DEF");

        System.out.println(strings.toString());

        strings.add(0, "James"); // put data between the ABC and DEF

        System.out.println(strings.toString());

        strings.remove("James");

        strings.set(1, "IJK");

        System.out.println(strings.toString());

//        System.out.println(strings.toString());
//
//        ArrayList<Employee> employees = new ArrayList<Employee>();
//        employees.add(new Employee("ABC", 5000, LocalDate.now()));
//        employees.add(new Employee("DEF", 5000, LocalDate.now()));
//        employees.add(new Employee("IJK", 5000, LocalDate.now()));
//        employees.add(new Employee("LMN", 5000, LocalDate.now()));
//
//        System.out.println(employees.get(3));




//        System.out.println(employees);
//
//        employees.remove(new Employee("ABC", 5000, LocalDate.now()));
//
//        System.out.println(employees);
//
//        System.out.println(employees.isEmpty());
//
//        employees.clear();
//
//        System.out.println(employees.isEmpty());

//        strings.remove(0);
//
//        System.out.println(strings.toString());
    }
}
