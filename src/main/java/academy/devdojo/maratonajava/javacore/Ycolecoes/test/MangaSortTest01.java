package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5l, "Attack on Titan", 19.9));
        mangas.add(new Manga(1l,"Berserk", 9.9));
        mangas.add(new Manga(3l,"Psiren", 37.50));
        mangas.add(new Manga(4l,"Naruto Shippuden", 14));
        mangas.add(new Manga(2l,"Boku no Hero", 9.9));
        mangas.add(new Manga(6l,"One Punch Man",18.9));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("-----------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("-----------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
