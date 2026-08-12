import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] elementos = {10, 20, 30, 40, 50};
        double maior = elementos[0];
        double menor = elementos[0];

        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] > maior){
                maior = elementos[i];
            }
        }
        for (int i = 1; i < elementos.length; i++){
            if (elementos[i] < menor){
                menor = elementos[i];
            }
        }
        double media = elementos / elementos.length;


        System.out.println("O maior elemento é: "+maior);
        System.out.println("O menor elemento é: "+menor);
        System.out.println("A media é: ");
    }
}
