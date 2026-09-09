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

        double maiorReceita = 0;
        for (int i = 0; i < lojas.length; i++){

            double receita = lojas[i].calcularReceita();
            if (receita > maiorReceita){
                maiorReceita = receita;

            }
        }
        System.out.println("A loja com maior receita tem: R$"+maiorReceita);

    }
}
