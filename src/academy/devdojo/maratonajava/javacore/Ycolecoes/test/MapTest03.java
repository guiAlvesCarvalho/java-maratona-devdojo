package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Guilherme");
        Consumidor consumidor2 = new Consumidor("William-sensei DevDojo");

        Manga manga1 = new Manga(5l, "Attack on Titan", 19.9);
        Manga manga2 = new Manga(1l,"Berserk", 9.9);
        Manga manga3 = new Manga(3l,"Psiren", 37.50);
        Manga manga4 = new Manga(4l,"Naruto Shippuden", 14);
        Manga manga5 = new Manga(2l,"Boku no Hero", 9.9);
        Manga manga6 = new Manga(6l,"One Punch Man",18.9);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("---"+entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("------"+manga.getNome());
            }

        }

    }
}
