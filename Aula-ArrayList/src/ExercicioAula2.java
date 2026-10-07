public class ExercicioAula2 {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Citroen", "C4", "XHFKE-102", 2019, 67000);
        Veiculo v2 = new Veiculo("Honda", "tchurosbango", "tchurosbago", 2018, 100000);
        Veiculo v3 = new Veiculo("Honda", "Civic", "gggghhh", 2010, 54000);
        Veiculo v4 = new Veiculo("BYD", "BetaD", "010101", 2025, 55500);

        Concessionaria c1 = new Concessionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        System.out.println(c1.obterVeiculoMaisBarato());

        Concessionaria c2 = new Concessionaria();
        c2.adicionarVeiculo(v3);
        c2.adicionarVeiculo(v4);

        System.out.println(c2.obterVeiculoMaisBarato());
        
    }
}
