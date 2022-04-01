package day6.calendar;

public class DateOfBirthCalendar {

    public static void main(String[] args) {

        CalendarOperation person = new CalendarOperation();    // Creates an object to access private variables through inheritance class
        person.setMonth(4);                                     // sets person complementary age in month to the private month variable
        person.setDay(26);                                      // sets person complementary age in days to the private month variable
        person.setYear(1987);                                   // sets person age in years to the private year variable

        person.calendar();                                      // calls the method that gives the DOB Message.


    }

}
