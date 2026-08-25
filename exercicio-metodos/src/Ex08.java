import java.util.Scanner;

public class Ex08 {

    public static double obterMediaNotas(double num1, double num2, double num3) {
        double soma = num1 + num2 + num3;
        double media = soma / 3;
        if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10 || num3 < 0 || num3 > 10) {
            return 0;
        }
        return media;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a 1º nota: ");
        double nota1 = input.nextInt();
        System.out.println("Digite a 2º nota: ");
        double nota2 = input.nextInt();
        System.out.println("Digite a 3º nota: ");
        double nota3 = input.nextInt();

        System.out.println("Sua média é: " + obterMediaNotas(nota1, nota2, nota3));
    }
}
