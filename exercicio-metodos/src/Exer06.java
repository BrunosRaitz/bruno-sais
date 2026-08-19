import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Criação de nome de Personagem");
        System.out.println("Digite seu nome completo ");
        String nome = input.nextLine();
        System.out.println("Digite o nome completo da mãe");
        String nomeM = input.nextLine();
        System.out.println("Digite a cidade que nasceu");
        String cidade = input.nextLine();
        System.out.println("======================");

        generateStarWarsName(nome, nomeM, cidade);

    }

    public static void generateStarWarsName(String nome, String nomeM, String cidade){
        System.out.print(nome.substring(6,9)+nome.substring(0,2)+" ");
        System.out.print(nomeM.substring(8, 11)+cidade.substring(0, 3));

    }
}
