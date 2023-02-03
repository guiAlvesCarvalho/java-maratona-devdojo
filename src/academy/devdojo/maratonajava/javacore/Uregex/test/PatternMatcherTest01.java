package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // \d = Todos os dígitos numericos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z, A-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        // ? Zerou ou uma
        // * zerou ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "[a-zA-C]";
        // String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        // String regex = "0[xX][0-9a-fA-F]";
        // String regex = "\\S"
        // String texto = "abbababa";
        String texto2 = "cafeBABE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:   "+texto2);
        System.out.println("indice:  0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start()+" "+matcher.group());
        }

    }
}
