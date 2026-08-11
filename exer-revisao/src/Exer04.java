import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double maiorA = -1;
        double menorA = 1000;
        double somaA = 0;
        int cont = 0;
        String maiorI = "";
        String menorI = "";
        System.out.println("Digite a inscrição do atleta: ");
        String inscricao = input.next();
        while (!inscricao.equals("0")) {
            System.out.println("Digite a altura do atleta: ");
            double altura = input.nextDouble();

            if (altura > maiorA) {
                maiorA = altura;
                maiorI = inscricao;
            }

            if (altura < menorA){
                menorA = altura;
                menorI = inscricao;
            }
            somaA += altura;
            cont++;
            System.out.println("Digite a inscrição do atleta: ");
            inscricao = input.next();

        }
        double mediaA = somaA / cont;
        System.out.println("=================");
        System.out.println("Atleta mais alto  /  Inscrição: " + maiorI + " / Altura: " + maiorA);
        System.out.println("Atleta mais baixo /  Inscrição: "+menorI+" / Altura: "+menorA);
        System.out.println("Média de altura dos atletas: "+mediaA);
        System.out.println("Quantidade de atletas: "+cont);


    }
}
