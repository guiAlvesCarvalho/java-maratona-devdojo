package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Guilherme");
        Consumidor consumidor2 = new Consumidor("William-sensei DevDojo");

        Manga manga1 = new Manga(5l, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(1l,"Berserk", 9.9);
        Manga manga3 = new Manga(3l,"Psiren", 37.50);
        Manga manga4 = new Manga(4l,"Naruto Shippuden", 14);
        Manga manga5 = new Manga(2l,"Boku no Hero", 9.9);
        Manga manga6 = new Manga(6l,"One Punch Man",18.9);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga3);
        consumidorManga.put(consumidor2, manga1);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() +" - "+ entry.getValue().getNome());
        }
    }
}
