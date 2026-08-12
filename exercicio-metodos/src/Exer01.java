import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a estação do ano: ");
        int estacao = input.nextInt();

        if (estacao == 1){
            imprimirVerao();
        }
        if (estacao == 2){
            imprimirOutono();
        }
        if (estacao == 3){
            imprimirInverno();
        }
        if (estacao == 4){
            imprimirPrimavera();
        }
    }
    public static void imprimirVerao(){
        System.out.println("É verão \nE o tempo esta quente");
    }
    public static void imprimirOutono(){
        System.out.println("É outono \nE as folhas estao secas");
    }
    public static void imprimirInverno(){
        System.out.println("É inverno \nE tem neve caindo");
    }
    public static void imprimirPrimavera(){
        System.out.println("É primavera \nE as flores estao bonitas");
    }
}
