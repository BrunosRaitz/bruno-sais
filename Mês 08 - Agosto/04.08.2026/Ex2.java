import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Insira seu nome");
		String nome = input.next();

		System.out.println("Insira o seu salário fixo");
		double salarioFixo = input.nextDouble();

		System.out.println("Insira a receita gerada");
		double receita = input.nextDouble();

		double comissao = receita * 0.15;

		double salarioFinal = salarioFixo + comissao;

		System.out.println("O vendedor " + nome +
				" terá um salário de R$" + df.format(salarioFinal));

				// Commit no github
	}

}
