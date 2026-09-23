public class Ex06 {
    public static void main(String[] args) {


        Mercado unidadeDeBlumenau = new Mercado("Fifo do bao", 100, 2.34, 55, 2.77);
        Mercado unidadeDeJoinville = new Mercado("Atacadao do inferno", 142, 2.11, 67, 1.93);
        Mercado unidadeDeFlorianopolis = new Mercado("Seu Eugebio", 341, 1.21, 455, 0.89);

        Mercado[] mercados = {unidadeDeBlumenau, unidadeDeJoinville, unidadeDeFlorianopolis};

        double maiorReceitaM = Double.MIN_VALUE;
        int posicaoM = 0;
        for (int i = 0; i < mercados.length; i++){

            double receita = mercados[i].calcularReceitaMaca();
            if (receita > maiorReceitaM){
                maiorReceitaM = receita;
                posicaoM = i;

            }
        }

        double menorReceitaL = Double.MAX_VALUE;
        Mercado mercadoMenorReceitaLaranja = null;
        for (int i = 0; i < mercados.length; i++){
            double receita = mercados[i].calcularReceitaLaranja();
            if (receita < menorReceitaL){
                menorReceitaL = receita;
                mercadoMenorReceitaLaranja = mercados[i];
            }
        }

        double maiorReceitaTotal = 0;
        double segundaMaiorReceitaTotal = 0;
        Mercado mercadoSegundaMaiorReceitaTotal = null;
        for (int i = 0; i <mercados.length; i++){
            double receitaT = mercados[i].calcularReceitaTotal();
            if (receitaT > maiorReceitaTotal){
                maiorReceitaTotal = receitaT;
            }
        }
        for (int i = 0; i <mercados.length; i++){
            double receitaT = mercados[i].calcularReceitaTotal();
            if (receitaT > segundaMaiorReceitaTotal && receitaT != maiorReceitaTotal){

                segundaMaiorReceitaTotal = receitaT;
                mercadoSegundaMaiorReceitaTotal = mercados[i];
            }
        }

        double receitaGeralM = 0;
        double receitaGeralL = 0;

        for (int i = 0; i <mercados.length; i++){
            receitaGeralM += mercados[i].calcularReceitaMaca();
            receitaGeralL += mercados[i].calcularReceitaLaranja();
        }

        System.out.println("A loja com maior receita  de Maça é: ["+mercados[posicaoM].nome+"]\nR$"+maiorReceitaM);

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
