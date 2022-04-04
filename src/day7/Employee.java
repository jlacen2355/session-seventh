package day7;

import java.util.Calendar;

public class Employee {

   private String name; // mand
   private int age;  // mand
   private double salary; // mand
   private Calendar hireDate; // mand


   private String drivingLicenceNumber; // optional

   //Default Constructor
   private Employee(){

       System.out.println("Default Constructor");
   }

//   public static Employee getInstance(){
//       return new Employee();
//   }

   //Parameterized Constructor
    public Employee(String name, int age, double salary, Calendar hireDate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public Employee(String name, int age, double salary, Calendar hireDate, String drivingLicenceNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
        this.drivingLicenceNumber = drivingLicenceNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Calendar getHireDate() {
        return hireDate;
    }

    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }
}
