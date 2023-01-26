package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemComprar = "Eu vou comprar uma impressora 3D";
        String mensagemNaoComprar = "Ainda não tenho condições, mas vou ter";
        String resultado;
        if (salario > 5000) {
            resultado = mensagemComprar;
        } else {
            resultado = mensagemNaoComprar;
        }
        System.out.println(resultado);

        // Operador ternario (condicao) ? verdadeiro : falso
        resultado = salario > 5000 ? mensagemComprar : mensagemNaoComprar;
        System.out.println(resultado);

        // Ou assim de forma mais enxuta sem precisar criar as variáveis de mensagem
        resultado = salario > 5000 ? "Eu vou comprar uma impressora 3D" : "Ainda não tenho condições, mas vou ter";
        System.out.println(resultado);
    }
}
