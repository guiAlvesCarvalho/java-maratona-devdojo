package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Lamborghini;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        // Erro de compilação Carro.VELOCIDADE_LIMITE = 180;
        System.out.println(Carro.VELOCIDADE_LIMITE);

        /*
        Erro
        Comprador comprador2 = new Comprador();
        carro.COMPRADOR = comprador2;
         */

        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Lamborghini lamborghini = new Lamborghini();
        lamborghini.setNome("Urus");
        lamborghini.imprime();

    }
}
