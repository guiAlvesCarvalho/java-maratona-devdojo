package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        /*
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // (-(ponto de inserção) -1)
        // index 0,1,2,3
        // value 0,2,3,4
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,2));
        System.out.println(Collections.binarySearch(numeros,0));
        System.out.println(Collections.binarySearch(numeros,-1));
        */
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5l, "Attack on Titan", 19.9));
        mangas.add(new Manga(1l,"Berserk", 9.9));
        mangas.add(new Manga(3l,"Psiren", 37.50));
        mangas.add(new Manga(4l,"Naruto Shippuden", 14));
        mangas.add(new Manga(2l,"Boku no Hero", 9.9));
        mangas.add(new Manga(6l,"One Punch Man",18.9));

        // Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(6l, "One Punch Man", 18.9);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));



    }
}
