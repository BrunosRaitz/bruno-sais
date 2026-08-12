import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do colega: ");
        String nome = input.next();

        switch (nome.toLowerCase()){
            case ("uelison") -> imprimirUelison();
            case ("otavio") -> imprimirOtavio();
            case("cauan") -> imprimirCauan();
        }

    }
    public static void imprimirUelison(){
        System.out.println("Seu nome é Uelison \nEle tem 95 anos \nEle é estudante DEV.");
    }
    public static void imprimirOtavio(){
        System.out.println("Seu nome é Otavio \nEle tem 67 anos \nEle é estudante DEV.");
    }
    public static void imprimirCauan(){
        System.out.println("Seu nome é Cauan \nEle tem 89 anos \nEle é estudante DEV.");
    }
}
