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
    }
    public static void acharMaiorValor(int [] vetor){
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior) maior = vetor[i];
        }
        System.out.println("O maior valor é: " + maior);
    }
}
