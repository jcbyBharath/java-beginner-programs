package main.com.jc.intermediate.dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Examples {

    public static void main(String[] args) {

        String date = "2023-05-01";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);

        String dateTime = "2023-05-20T10:12:55";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println(localDateTime);

        String date1 = "20/05/2023";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(date1, dtf);

        System.out.println(localDate1);
        System.out.println(localDate.toString());

        String s = localDate1.toString();
        System.out.println(Period.between(localDate, localDate1).getDays());
    }
}
