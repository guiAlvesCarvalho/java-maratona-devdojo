package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5l, "Attack on Titan", 19.9,0));
        mangas.add(new Manga(1l,"Berserk", 9.9,5));
        mangas.add(new Manga(3l,"Psiren", 37.50,0));
        mangas.add(new Manga(4l,"Naruto Shippuden", 14,2));
        mangas.add(new Manga(2l,"Boku no Hero", 9.9,0));
        mangas.add(new Manga(6l,"One Punch Man",18.9,0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
