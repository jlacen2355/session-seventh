package day16;

public class Officce {

    public static void main(String[] args) {
        Employee employee = new Employee("James", 35, 5000);
        Manager boss = new Manager("Carlos", 33, 8000, 1000);
        Executive executive = new Executive("BJ", 40, 8000, 1000, 1000);

        System.out.println(employee.getSalary());
        System.out.println(boss.getSalary());
        System.out.println(executive.getSalary());
    }
}
