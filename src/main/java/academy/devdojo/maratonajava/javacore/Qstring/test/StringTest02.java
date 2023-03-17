package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "   Luffy   ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        int[] nums = {1,2,3};
        // System.out.println(nums.length); length é atributo do array
        System.out.println(nome.length()); // length é método, por isso os ()
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0, 2));
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(numeros.substring(3));
        System.out.println(nome.trim());

    }
}
