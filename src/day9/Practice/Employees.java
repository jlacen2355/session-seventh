package day9.Practice;

/**
 * This Class contains all the data variables to store employee information
 * Author: James Lacen
 * Rersion 1.1
 */

public class Employees {
    /**
     * In this first stage all variable for mandatory employee information are created.
     */

    private String employeeNumber;
    private String agency;
    private String name;
    private String language;

    /**
     * In this Second stage all variable for non-mandatory employee information are created.
     * not necessary to be provided by the employee and the system.
     */
    private String drivingLicenseNumber;

    /**
     * In this Third step we create a private constructor to display a message witout parameters.
     */
    private Employees(){
        System.out.println("Default Constructor");
    }
    /**
     * In this section we create constructors requiring certain parameters Applying polymorphism
     */
    //Parameterized Constructor for employees without drivingLicenseNumber
    public Employees(String employeeNumber, String agency, String name, String language) {
        this.employeeNumber = employeeNumber;
        this.agency = agency;
        this.name = name;
        this.language = language;
    }

    //Parameterized Constructor for employees with drivingLicenseNumber
    public Employees(String employeeNumber, String agency, String name, String language, String drivingLicenseNumber) {
        this.employeeNumber = employeeNumber;
        this.agency = agency;
        this.name = name;
        this.language = language;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    /**
     * In the last part we create constructors get and set tools in the way that any can access or get information
     * from the private variables.
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getAgency() {
        return agency;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenseNumber;
    }
}
