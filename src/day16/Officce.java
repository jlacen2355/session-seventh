package day16;

public class Officce {

    public static void main(String[] args) {
        Employee employee = new Employee("ABC", 25, 5000);
        Manager boss = new Manager("DEF", 35, 8000, 1000);

        System.out.println(employee.getSalary());
        System.out.println(boss.getSalary());
    }
}
