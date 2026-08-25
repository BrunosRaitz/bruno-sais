import java.util.Scanner;

public class Ex10 {

    public static String obterNumeroValido(double max, double min, double num) {

        if (num > max || num < min) {
            return num + " É um número invalido";
        } else {
            return num + " está nos limites impostos";
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor maximo");
        double max = input.nextDouble();
        System.out.println("Dgite o valor minimo");
        double min = input.nextDouble();
        System.out.println("Digite um valor");
        double valor = input.nextDouble();

        System.out.println(obterNumeroValido(max, min, valor));

    }
}
