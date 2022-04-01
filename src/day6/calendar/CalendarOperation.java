package day6.calendar;

import java.time.Month;
import java.util.Calendar;

public class CalendarOperation {

    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void calendar() {

        CalendarOperation calendar = new CalendarOperation();

        //Option #1
        Calendar dateOfBirthday = Calendar.getInstance();
        dateOfBirthday.set(this.getYear(), this.getMonth(), this.getDay());
        System.out.println("My Birthday is in --> " + Month.of(dateOfBirthday.get(Calendar.MONTH)).name() + " " + dateOfBirthday.get(Calendar.DATE) + " " + dateOfBirthday.get(Calendar.YEAR));


        //Option #2
//        Calendar dateOfBirthday = Calendar.getInstance();
//        dateOfBirthday.set(Calendar.YEAR, getYear());
//        dateOfBirthday.set(Calendar.MONTH, getMonth()-1);
//        dateOfBirthday.set(Calendar.DATE, getDay());
//
//        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyy");
//        System.out.println("My Birthday is in --> " + sdf.format(dateOfBirthday.getTime()));

    }

}
