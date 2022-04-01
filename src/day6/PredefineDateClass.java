package day6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class PredefineDateClass {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 1995);
        dateOfBirth.set(Calendar.MONTH, 8);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 15);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");

        System.out.println(dateFormat.format(dateOfBirth.getTime()));

    }

}
