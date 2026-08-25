import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PAR = True / IMPAR = False");
        System.out.println("Digite um valor:");
        int valor = input.nextInt();

        System.out.println("Seu número é: " + acharParImpar(valor));

    }

    public static boolean acharParImpar(int num) {
        return num % 2 == 0;

    }
}
