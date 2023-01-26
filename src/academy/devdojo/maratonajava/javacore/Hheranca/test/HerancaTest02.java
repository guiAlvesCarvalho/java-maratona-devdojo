package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

// 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a superclasse
// 1 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe filha
// 2 - Alocado espaço em memória para o objeto da superclasse
// 3 - Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado da superclasse
// 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
// 5 - Contrutor é executado na superclasse
// 6 - Alocado espaço em memória para o objeto da subclasse
// 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
// 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
// 9 - Contrutor é executado na subclasse
public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Genos");
    }
}
