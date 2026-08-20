import java.util.Scanner;

public class Ex08 {

    public static double obterMediaNotas(double num1, double num2, double num3){
        double soma = num1 + num2 + num3;
        double media = soma / 3;
        return  media;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a 1º nota: ");
        int nota1 = input.nextInt();
        System.out.println("Digite a 2º nota: ");
        int nota2 = input.nextInt();
        System.out.println("Digite a 3º nota: ");
        int nota3 = input.nextInt();

        System.out.println("Sua média é: " +obterMediaNotas(nota1, nota2, nota3));
    }
}
