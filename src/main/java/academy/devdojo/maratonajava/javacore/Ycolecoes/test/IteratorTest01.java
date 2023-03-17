package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5l, "Attack on Titan", 19.9,0));
        mangas.add(new Manga(1l,"Berserk", 9.9,5));
        mangas.add(new Manga(3l,"Psiren", 37.50,0));
        mangas.add(new Manga(4l,"Naruto Shippuden", 14,2));
        mangas.add(new Manga(2l,"Boku no Hero", 9.9,0));
        mangas.add(new Manga(6l,"One Punch Man",18.9,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }
        
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);

    }
}
