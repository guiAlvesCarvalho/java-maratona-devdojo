package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Satoru");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{1200, 997.97, 2000});

        funcionario.imprime();

    }
}
