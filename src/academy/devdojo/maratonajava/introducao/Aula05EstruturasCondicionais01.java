package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // dentro do if é obrigatório um booleano
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar uma skolzinha");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        if(!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        System.out.println("Fora do if");
    }
}
