package day7.Practice;

public class WarehouseOffice {

    public static void main(String[] args) {

        Employees jose = new Employees("3548135120", "Ecolink", "Jose", "Spanish");
        System.out.println("EmployeeNumber: " + jose.getEmployeeNumber());
        System.out.println("Agency: " + jose.getAgency());
        System.out.println("Name: " + jose.getName());
        System.out.println("Language: " + jose.getLanguage());
        System.out.println("____________________________________________________");

        Employees james = new Employees("594326012", "Protech", "James", "Spa/Eng", "20220401");
        System.out.println("EmployeeNumber: " + james.getEmployeeNumber());
        System.out.println("Agency: " + james.getAgency());
        System.out.println("Name: " + james.getName());
        System.out.println("Language: " + james.getLanguage());
        System.out.println("Driver License #: " + james.getDrivingLicenceNumber());
        System.out.println("____________________________________________________");

        Employees raju = new Employees("156459546", "Vssi", "Raju", "Nepali");
        System.out.println("EmployeeNumber: " + raju.getEmployeeNumber());
        System.out.println("Agency: " + raju.getAgency());
        System.out.println("Name: " + raju.getName());
        System.out.println("Language: " + raju.getLanguage());
        System.out.println("____________________________________________________");

        Employees karina = new Employees("985465027", "Ecomm", "Karina", "English", "20220211");
        System.out.println("EmployeeNumber: " + karina.getEmployeeNumber());
        System.out.println("Agency: " + karina.getAgency());
        System.out.println("Name: " + karina.getName());
        System.out.println("Language: " + karina.getLanguage());
        System.out.println("Driver License #: " + karina.getDrivingLicenceNumber());
        System.out.println("____________________________________________________");

        Employees alberto = new Employees("496147951", "Connection", "Alberto", "Spanish", "20220211");
        System.out.println("EmployeeNumber: " + jose.getEmployeeNumber());
        System.out.println("Agency: " + alberto.getAgency());
        System.out.println("Name: " + alberto.getName());
        System.out.println("Language: " + alberto.getLanguage());
        System.out.println("Driver License #: " + alberto.getDrivingLicenceNumber());
        System.out.println("____________________________________________________");

        Employees beth = new Employees("357486159", "Zanzay", "beth", "Spanish");
        System.out.println("EmployeeNumber: " + beth.getEmployeeNumber());
        System.out.println("Agency: " + beth.getAgency());
        System.out.println("Name: " + beth.getName());
        System.out.println("Language: " + beth.getLanguage());
        System.out.println("____________________________________________________");

    }

}
