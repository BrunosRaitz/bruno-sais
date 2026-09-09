public class Ex06 {
    public static void main(String[] args) {


        Mercado[] lojas = new Mercado[3];

        lojas[0] = new Mercado();
        lojas[0].nome = "Fifo do bao";
        lojas[0].vendasM = 100;
        lojas[0].precoM = 2.34;
        lojas[0].vendasL = 55;
        lojas[0].precoL = 2.77;

        lojas[1] = new Mercado();
        lojas[1].nome = "Atacadao do inferno";
        lojas[1].vendasM = 142;
        lojas[1].precoM = 2.11;
        lojas[1].vendasL = 67;
        lojas[1]. precoL = 1.93;

        lojas[2] = new Mercado();
        lojas[2].nome = "Seu Eugebio";
        lojas[2]. vendasM = 341;
        lojas[2]. precoM = 1.21;
        lojas[2]. vendasL = 455;
        lojas[2].precoL = 0.89;

        double maiorReceitaM = Double.MIN_VALUE;
        int posicaoM = 0;
        for (int i = 0; i < lojas.length; i++){

            double receita = lojas[i].calcularReceitaMaca();
            if (receita > maiorReceitaM){
                maiorReceitaM = receita;
                posicaoM = i;

            }
        }

        double menorReceitaL = Double.MAX_VALUE;
        Mercado mercadoMenorReceitaLaranja = null;
        for (int i = 0; i < lojas.length; i++){
            double receita = lojas[i].calcularReceitaLaranja();
            if (receita < menorReceitaL){
                menorReceitaL = receita;
                mercadoMenorReceitaLaranja = lojas[i];
            }
        }

        double maiorReceitaTotal = 0;
        double segundaMaiorReceitaTotal = 0;
        Mercado mercadoSegundaMaiorReceitaTotal = null;
        for (int i = 0; i <lojas.length; i++){
            double receitaT = lojas[i].calcularReceitaTotal();
            if (receitaT > maiorReceitaTotal){
                maiorReceitaTotal = receitaT;
            }
        }
        for (int i = 0; i <lojas.length; i++){
            double receitaT = lojas[i].calcularReceitaTotal();
            if (receitaT > segundaMaiorReceitaTotal && receitaT != maiorReceitaTotal){

                segundaMaiorReceitaTotal = receitaT;
                mercadoSegundaMaiorReceitaTotal = lojas[i];
            }
        }

        double receitaGeralM = 0;
        double receitaGeralL = 0;

        for (int i = 0; i <lojas.length; i++){
            receitaGeralM += lojas[i].calcularReceitaMaca();
            receitaGeralL += lojas[i].calcularReceitaLaranja();
        }

        System.out.println("A loja com maior receita  de Maça é: ["+lojas[posicaoM].nome+"]\nR$"+maiorReceitaM);

        System.out.println("A loja com menor receita de Laranja é: ["+mercadoMenorReceitaLaranja.nome + "]\nR$"+menorReceitaL);

        System.out.println("A loja com segunda maior receita total é: ["+mercadoSegundaMaiorReceitaTotal.nome + "]\nR$" +segundaMaiorReceitaTotal);
        if (receitaGeralL > receitaGeralM){
            System.out.println("A franquia teve a maior receita vendendo laranjas.");
            System.out.println("R$"+receitaGeralL);
        } else if (receitaGeralM > receitaGeralL) {
            System.out.println("A franquia teve a maior receita vendendo maças.");
            System.out.println("R$"+receitaGeralM);
        }else {
            System.out.println("Ambas fraquias tiveream a mesma receita de maça e laranjas.");
        }
        
    }
}
