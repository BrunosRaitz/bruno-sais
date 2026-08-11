import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do vendedor: ");
        String nome = sc.nextLine();
        System.out.println("Salario fixo: ");
        double salarioF = sc.nextDouble();
        System.out.println("Total de vendas feitas (mes): ");
        double quantiaVendas = sc.nextInt();

        double comissao = (quantiaVendas * 15) / 100;
        System.out.println("=====================");
        System.out.printf("Total a receber = %.2f  ", (comissao + salarioF));
    }
}
