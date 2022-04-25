package day18;

import java.time.LocalDate;

public class Office {

    public static void main(String[] args) {
        Employee employee1 = new Employee("ABC", 5000, LocalDate.now());
        Employee employee2 = new Employee("ABC", 5000, LocalDate.now());


//        employee.toString();


        System.out.println(employee1.toString());// false
        System.out.println(employee2.toString()); // true (after overriding equals and hashcode method)

        boolean isEqual = employee1 == employee2;
        boolean isEqual1 = employee1.equals(employee2);

        System.out.println(isEqual);
        System.out.println(isEqual1);


    }

}
