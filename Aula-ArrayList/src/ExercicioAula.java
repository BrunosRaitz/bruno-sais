import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExercicioAula {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> listaNumero = new ArrayList<>();

        listaNumero.addAll(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("Digite um valor: ");
        int n = input.nextInt();

        if (listaNumero.contains(n)){
            System.out.println(listaNumero.indexOf(n));
        }else {
            System.out.println("Numero nao presente");
        }

    }
}
