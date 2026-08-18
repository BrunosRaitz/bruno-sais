import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] valor = new int[3];

        System.out.println("Digite 3 valores");

        for (int i = 0; i < valor.length; i++){
            System.out.println((i+1)+"° valor: ");
            valor[i] = input.nextInt();
        }

        imprimirValorMaisProximo(valor);

    }

    public static void imprimirValorMaisProximo(int []valor){
        int distancia1 = Math.abs(valor[1] - valor[0]);
        int distancia2 = Math.abs(valor[2] - valor[0]);

        if (distancia1 < distancia2){
            System.out.println("O número mais perto de "+ valor[0] +" é: "+ valor[1]);

        } else if (distancia2 < distancia1) {
            System.out.println("O número mais perto de "+ valor[0] +" é: "+ valor[2]);

        }else {
            System.out.println("Ambos os valores estao igualmente perto de "+valor[0]);
            System.out.println(valor[1]+" com distancia de: "+distancia1 +"\n"+ valor[2]+" com distancia de: "+distancia2);
        }
    }

}

