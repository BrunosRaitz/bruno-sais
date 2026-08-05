import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// Entrada de dados
		System.out.println("Insira o seu número de matrícula");
		String matricula = input.next();

		System.out.println("Insira o seu nome");
		String nome = input.next();

		System.out.println("Insira a quantidade de horas trabalhadas");
		double horasTrabalhadas = input.nextDouble();

		System.out.println("Insira o seu salário por hora");
		double salarioHora = input.nextDouble();

		// Processo
		double salarioMensal = horasTrabalhadas * salarioHora * 4;

		// Saída de código

		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("Salário mensal: R$" + df.format(salarioMensal));

	}

}
