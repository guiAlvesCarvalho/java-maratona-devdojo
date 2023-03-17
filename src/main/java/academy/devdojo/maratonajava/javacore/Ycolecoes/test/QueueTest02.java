package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5l, "Attack on Titan", 19.9,0));
        mangas.add(new Manga(1l,"Berserk", 9.9,5));
        mangas.add(new Manga(3l,"Psiren", 37.50,0));
        mangas.add(new Manga(4l,"Naruto Shippuden", 14,2));
        mangas.add(new Manga(2l,"Boku no Hero", 9.9,0));
        mangas.add(new Manga(6l,"One Punch Man",18.9,0));

        while(!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
