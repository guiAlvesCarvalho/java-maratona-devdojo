package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa marota"));
        System.out.println(barcoList);
    }

//    private static <T> void criarArrayComUmObjeto(T t){
//        List<T> list = List.of(t);
//        System.out.println(list);
//    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}


