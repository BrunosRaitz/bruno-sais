public class Ex02 {
    public static void main(String[] args) {


        Mercado unidadeDeBlumenau = new Mercado();
        Mercado unidadeDeJoinville = new Mercado();
        Mercado unidadeDeFlorianopolis = new Mercado();

        unidadeDeBlumenau.nome = "Fifo do bao";
        unidadeDeBlumenau.vendasM = 100;
        unidadeDeBlumenau.precoM = 2.34;
        unidadeDeBlumenau.vendasL = 55;
        unidadeDeBlumenau.precoL = 2.77;

        unidadeDeJoinville.nome = "Atacadao do inverno";
        unidadeDeBlumenau.vendasM = 142;
        unidadeDeJoinville.precoM = 2.11;
        unidadeDeJoinville.vendasL = 67;
        unidadeDeJoinville.precoL = 1.93;


        unidadeDeFlorianopolis.nome = "Seu Eugebio";
        unidadeDeFlorianopolis.vendasM = 341;
        unidadeDeFlorianopolis.precoM = 1.21;
        unidadeDeFlorianopolis.vendasL = 455;
        unidadeDeFlorianopolis.precoL = 0.89;

        System.out.println(unidadeDeBlumenau.nome);
        System.out.println("Venda Maça: "+unidadeDeBlumenau.vendasM+"\nPreço Maça: R$"+unidadeDeBlumenau.precoM);
        System.out.println("Venda Laranja: "+unidadeDeBlumenau.vendasL+"\nPreço Laranja: R$"+unidadeDeBlumenau.precoL);



    }
}
