import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite os valores do vetor");

        for (int i = 0; i < vetor.length; i++){
            System.out.println((i+1)+"° valor: ");
            vetor[i] = input.nextInt();
        }

        acharMaiorValor(vetor);
        acharMenorValor(vetor);
        acharMedia(vetor);
    }
    public static void acharMaiorValor(int [] vetor){
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior) maior = vetor[i];
        }
        System.out.println("O maior valor é: " + maior);
    }

    public static void acharMenorValor(int [] vetor){
        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < menor) menor = vetor[i];
        }
        System.out.println("O menor valor é: "+menor);
    }

    public static void acharMedia(int [] vetor){
        double soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.println("A media é: "+ media);
    }
}
