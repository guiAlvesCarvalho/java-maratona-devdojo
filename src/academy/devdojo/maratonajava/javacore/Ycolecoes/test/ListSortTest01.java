package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Psiren");
        mangas.add("Naruto Shippuden");
        mangas.add("Boku no Hero");
        mangas.add("One Punch Man");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(102.30);
        dinheiros.add(21.50);
        dinheiros.add(5D);
        dinheiros.add(75.80);
        dinheiros.add(33.33);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

    }
}
