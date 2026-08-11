import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Calculo IMC =====");
        System.out.println();
        System.out.println("Digite o peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / Math.pow(altura,2);

        System.out.println("================");
        System.out.print("IMC = ");

        if (imc > 40){
            System.out.println("Obesidade Grau III (morbida)");
        } else if (imc >= 35) {
            System.out.println("Obesidade Grau II (severa)");
        } else if (imc >= 30) {
            System.out.println("Obesidade Grau I ");
        } else if (imc >= 25) {
            System.out.println("Sobrepeso");
        } else if (imc >= 18.5) {
            System.out.println("Saudável");
        }else{
            System.out.println("Magreza");
        }
    }
}
