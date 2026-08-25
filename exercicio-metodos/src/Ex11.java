import java.util.Scanner;

public class Ex11 {

    public static int acharMaiorValor(int[] vetor) {
        int maiorV = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorV) maiorV = vetor[i];
        }
        return maiorV;
    }

    public static int acharMenorValor(int[] vetor) {
        int menorV = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorV) menorV = vetor[i];
        }
        return menorV;
    }

    public static double acharMedia(int[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        return media;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = {5, 10, 15, 20, 25};

        System.out.println("O maior elemento é: " + acharMaiorValor(vetor));
        System.out.println("O menor elemento é: " + acharMenorValor(vetor));
        System.out.println("A média do vetor é: " + acharMedia(vetor));
    }
}
