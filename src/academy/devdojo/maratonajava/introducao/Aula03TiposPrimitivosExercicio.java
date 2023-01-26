package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie Variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Naruto";
        String endereco = "Aldeia da folha";
        double salario = 5468.60;
        String dataRecebimentoSalario = "07/01/2023";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
