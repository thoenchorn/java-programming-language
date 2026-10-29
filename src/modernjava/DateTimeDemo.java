package modernjava;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Module 13: the java.time API for dates, times, and durations.
 */
public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2005, 5, 20);

        System.out.println("Today: " + today);
        System.out.println("Birthday: " + birthday);
        System.out.println("Age: " + ChronoUnit.YEARS.between(birthday, today) + " years");
        System.out.println("Days until the end of the year: "
                + ChronoUnit.DAYS.between(today, today.withDayOfYear(today.lengthOfYear())));

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm");
        System.out.println("Now: " + now.format(formatter));

        Duration lesson = Duration.ofMinutes(45);
        System.out.println("Lesson length: " + lesson.toMinutes() + " minutes");
    }
}
