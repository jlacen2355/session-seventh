package day8;

import java.util.Calendar;

public class Employee {

   private static int employeeCount;
   public static int anyField;

   private String name; // mand
   private int age;  // mand
   private double salary; // mand
   private Calendar hireDate; // mand

   private String drivingLicenceNumber; // optional

   //Default Constructor
   private Employee(){ System.out.println("Default Constructor"); }

//    public static Employee getInstance(){
//      return new Employee();
//     }

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

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Calendar getHireDate() { return hireDate;
    }

    public void fireEmployee() {
       System.out.println(this.getName() + " is fired!!!!");
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }



}

