package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização NÃO estático 1 de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização NÃO estático 2 de Funcionario");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salrio de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}