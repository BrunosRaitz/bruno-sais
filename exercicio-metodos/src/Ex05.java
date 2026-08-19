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
  /* public static void obterNumeroPertoBase(int base, int num1, int num2) {

       *
        * Calcula a distância entre num1 e a base.
        *
        * Math.abs() retorna o valor absoluto de um número. Isso evita que a distância
        * seja negativa.
        *
        * Exemplo: se num1 = 8 e base = 10:
        *
        * 8 - 10 = -2 Math.abs(-2) = 2
        *
       int distanciaBase1 = Math.abs(num1 - base);
       int distanciaBase2 = Math.abs(num2 - base);

       if (distanciaBase1 < distanciaBase2) {
           System.out.println("O número mais perto é: " + num1);
       } else if (distanciaBase2 < distanciaBase1) {
           System.out.println("O número mais perto é: " + num2);
       } else {
           System.out.println("As distâncias são iguais");
       }

   }*/

}

