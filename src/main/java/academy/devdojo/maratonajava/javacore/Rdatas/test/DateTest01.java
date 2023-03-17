package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Não é utilizado hoje em dia
        Date date = new Date(1_000_000_000_000L); // long 100000
        System.out.println(date.toString());
        System.out.println(date.getTime()); // pega o dia e hora atual

    }
}
