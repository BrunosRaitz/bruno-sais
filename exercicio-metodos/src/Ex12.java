import java.util.Scanner;

public class Ex12 {

    public static String acharPosicaoSeParOuImpar(String palavra) {

        if (palavra.length() % 2 == 0) {
            return "É Par \nPrimeiro caractere é: [ " + palavra.charAt(0) + " ]";
        } else {
            return "É Impar \nSegundo caractere é: [ " + palavra.charAt(1) + " ]";
        }
    }

    public static int contarPalavra(String palavra) {
        int tamanhoPalavra = palavra.length();
        return tamanhoPalavra;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=====================");
        System.out.println("Digite uma palavra");
        String palavra = input.next();

        System.out.println("Quantidade de letras: " + contarPalavra(palavra));
        System.out.println(acharPosicaoSeParOuImpar(palavra));


    }
}
