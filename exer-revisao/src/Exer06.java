public class Exer06 {

    public static void main(String[] args) {

        int[][] matriz = {
                {210, 3, 399900},
                {160, 3, 329900},
                {240, 3, 369000},
                {141, 2, 232000},
                {300, 4, 539900},
                {198, 4, 299900},
                {153, 3, 314900},
                {142, 3, 199000},
                {138, 3, 212000},
                {149, 3, 242500},
                {194, 4, 240000},
                {200, 3, 347000},
                {189, 3, 330000},
                {447, 5, 699900},
                {126, 3, 259900}
        };
        double somaPreco = 0;
        int menorCasa = 0;
        int maiorNumQuartos = matriz[0][1];
        int menorNumQuartos = matriz[0][1];
        int tamanhoCasaMaiorQuartos = 0;
        int tamanhoCasaMenorQuartos = 0;
        double precoMenorCasa = 0;
        double casasCara = 0;
        int conta = 0;

        for (int linha = 0; linha < matriz.length; linha++){
            if (matriz[linha][0] < matriz[menorCasa][0]) {
                menorCasa = linha;
            }
            if (matriz[linha][1] > maiorNumQuartos){
                maiorNumQuartos = matriz[linha][1];
                tamanhoCasaMaiorQuartos = matriz[linha][0];
            }
            if (matriz[linha][1] < menorNumQuartos){
                menorNumQuartos = matriz[linha][1];
                tamanhoCasaMenorQuartos = matriz[linha][0];
            }
            if (matriz[linha][2] >= 300000){
                casasCara += matriz[linha][0];
                conta++;
            }

            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                if (coluna == 2){
                    somaPreco += matriz[linha][coluna];
                }
                if (linha == menorCasa && coluna == 2){
                    precoMenorCasa = matriz[linha][coluna];
                }
            }
        }
        System.out.println(somaPreco);
        double mediaPreco = somaPreco / matriz.length;
        double mediaCasasCara = (double) casasCara / conta;
        System.out.printf("A media de preço é: R$%.2f%n", mediaPreco);
        System.out.println("A menor casa tem: "+matriz[menorCasa][0]+"m² e custa: R$"+precoMenorCasa);
        System.out.println("A diferença de tamanho da maior para a menor casa é: "+(tamanhoCasaMaiorQuartos - tamanhoCasaMenorQuartos)+"m²");
        System.out.println("A média de tamanho de casas acima de R$300.000 é: "+mediaCasasCara);


    }
}
