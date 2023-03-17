package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

// Ao colocar o final class, a classe não poderá ser herdada, portanto não poderá mudar o comportamento dos métodos
// Um exemplo de classe final é a String, pois é muito importante e se deve garantir o comportamento de como as coisas funcionam
public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();


    // Ao colocar o final no método ele não poderá ser sobrescrito
    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
