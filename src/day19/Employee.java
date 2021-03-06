package day19;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

    private String name;
    private float salary;
    private LocalDate hireDate;

    public Employee(String name, float salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(hireDate, employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDate);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return hireDate.compareTo(o.hireDate);
    }
}
