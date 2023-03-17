package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 5700g", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("------------------");
        Produto produto2 = new Tomate("Tomatinho", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}
