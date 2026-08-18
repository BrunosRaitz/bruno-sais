import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = input.nextInt();
        imprimirProxNumero(valor);

    }
    public static void imprimirProxNumero(int valor){
        System.out.println("Seu numero é: "+valor);
        for (int i = 1; i <= 20; i++){
            System.out.println("Proximo valor: "+(valor+i));
        }
    }

    //public static void imprimirProxNumero(int valor){
    //    System.out.println("Seu numero é: "+valor);
    //    for (int i = valor + 1; i <= valor + 20; i++){
    //        System.out.println("Proximo valor: "+i);
    //    }
    //}
}
