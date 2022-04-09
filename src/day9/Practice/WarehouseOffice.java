package day9.Practice;

/**
 * This Class contains all the data manipulation objects variables to store employee information
 * Programmer: James Lacen
 * Rersion 1.2
 * Date: 04/08/22
 */

public class WarehouseOffice {

    public static void main(String[] args) {

        /**
         * In this first stage we create an object to manipulate information to store employee data in the private
         * variables on the employee class.
         */
        //Object employee is created with mandatory parameters but without non-madatory parameters to store data in the private variables
        Employees jose = new Employees("3548135120", "Ecolink", "Jose", "Spanish");
        //first step display employee number using the object to obtain data from private variable
        System.out.println("EmployeeNumber: " + jose.getEmployeeNumber());
        //Second step display employee Agency
        System.out.println("Agency: " + jose.getAgency());
        //Third step display employee Name
        System.out.println("Name: " + jose.getName());
        //Third step display employee Language
        System.out.println("Language: " + jose.getLanguage());
        System.out.println("____________________________________________________");

        //Object employee is created with mandatory parameters but with non-madatory parameters to store data in the private variables
        Employees james = new Employees("594326012", "Protech", "James", "Spa/Eng", "20220401");
        //first step display employee number using the object to obtain data from private variable
        System.out.println("EmployeeNumber: " + james.getEmployeeNumber());
        //Second step display employee Agency
        System.out.println("Agency: " + james.getAgency());
        //Third step display employee Name
        System.out.println("Name: " + james.getName());
        //Third step display employee Language
        System.out.println("Language: " + james.getLanguage());
        System.out.println("Driver License #: " + james.getDrivingLicenceNumber());
        System.out.println("____________________________________________________");

        //Object employee is created with mandatory parameters but without non-madatory parameters to store data in the private variables
        Employees raju = new Employees("156459546", "Vssi", "Raju", "Nepali");
        //first step display employee number using the object to obtain data from private variable
        System.out.println("EmployeeNumber: " + raju.getEmployeeNumber());
        //Second step display employee Agency
        System.out.println("Agency: " + raju.getAgency());
        //Third step display employee Name
        System.out.println("Name: " + raju.getName());
        //Third step display employee Language
        System.out.println("Language: " + raju.getLanguage());
        System.out.println("____________________________________________________");

        //Object employee is created with mandatory parameters but with non-madatory parameters to store data in the private variables
        Employees karina = new Employees("985465027", "Ecomm", "Karina", "English", "20220211");
        //first step display employee number using the object to obtain data from private variable
        System.out.println("EmployeeNumber: " + karina.getEmployeeNumber());
        //Second step display employee Agency
        System.out.println("Agency: " + karina.getAgency());
        //Third step display employee Name
        System.out.println("Name: " + karina.getName());
        //Third step display employee Language
        System.out.println("Language: " + karina.getLanguage());
        //forth step display the non-mandatory employee drivinglincenumber information
        System.out.println("Driver License #: " + karina.getDrivingLicenceNumber());
        System.out.println("____________________________________________________");

        //Object employee is created with mandatory parameters but with non-madatory parameters to store data in the private variables
        Employees alberto = new Employees("496147951", "Connection", "Alberto", "Spanish", "20220211");
        //first step display employee number using the object to obtain data from private variable
        System.out.println("EmployeeNumber: " + jose.getEmployeeNumber());
        //Second step display employee Agency
        System.out.println("Agency: " + alberto.getAgency());
        //Third step display employee Name
        System.out.println("Name: " + alberto.getName());
        //Third step display employee Language
        System.out.println("Language: " + alberto.getLanguage());
        //forth step display the non-mandatory employee drivinglincenumber information
        System.out.println("Driver License #: " + alberto.getDrivingLicenceNumber());
        System.out.println("____________________________________________________");

        //Object employee is created with mandatory parameters but without non-madatory parameters to store data in the private variables
        Employees beth = new Employees("357486159", "Zanzay", "beth", "Spanish");
        //first step display employee number using the object to obtain data from private variable
        System.out.println("EmployeeNumber: " + beth.getEmployeeNumber());
        //Second step display employee Agency
        System.out.println("Agency: " + beth.getAgency());
        //Third step display employee Name
        System.out.println("Name: " + beth.getName());
        //Third step display employee Language
        System.out.println("Language: " + beth.getLanguage());
        System.out.println("____________________________________________________");

    }

}
