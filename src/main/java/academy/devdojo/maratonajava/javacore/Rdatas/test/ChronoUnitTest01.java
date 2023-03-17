package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1997, Month.APRIL, 28, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("DIAS "+ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("SEMANAS "+ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("MESES "+ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println("ANOS "+ChronoUnit.YEARS.between(aniversario, now));
    }
}
