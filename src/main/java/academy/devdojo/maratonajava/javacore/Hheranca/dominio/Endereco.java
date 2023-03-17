package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    /*
    pessoa.nome está protected, mas
    funciona porque está dentro do mesmo pacote
    public void imprime(){
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Exemplo";
    }
    */
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
