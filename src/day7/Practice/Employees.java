package day7.Practice;

public class Employees {

    //Mandatory information
    private String employeeNumber;
    private String agency;
    private String name;
    private String language;

    //Optional information
    private String drivingLicenseNumber;


    private Employees(){
        System.out.println("Default Constructor");
    }

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
