import java.util.Scanner;

public class Ex07 {

    public static String obterVerao() {

        return "É verão \nE o tempo esta quente";
    }

    public static String obterInverno() {
        return "É inverno \nE está frio";
    }

    public static String obterOutuno() {
        return "É outuno \nAs folhas caem";
    }

    public static String obterPrimavera() {
        return "É primavera \nAs flores sao bonitas";
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a estação do ano");
        int estacao = input.nextInt();

        switch (estacao) {
            case (1) -> System.out.println(obterVerao());
            case (2) -> System.out.println(obterInverno());
            case (3) -> System.out.println(obterOutuno());
            case (4) -> System.out.println(obterPrimavera());
        }

    }
}
