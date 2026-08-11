import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da matricula do funcionario: ");
        String codigo = sc.next();

        System.out.println("Digite o nome: ");
        String nome = sc.next();

        System.out.println("Horas trabalhadas: ");
        double horasT = sc.nextDouble();

        System.out.println("Valor da hora trabalhada: ");
        double valorH = sc.nextDouble();

        double salario = valorH * horasT * 4;

        System.out.println("======================");
        System.out.println("Matricula: "+codigo);
        System.out.println("Nome: "+nome);
        System.out.printf("Salario: R$ %.2f%n",salario);

    }
}
