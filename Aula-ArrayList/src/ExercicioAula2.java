public class ExercicioAula2 {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Citroen", "C4", "XHFKE-102", 2019, 67000);
        Veiculo v2 = new Veiculo("Honda", "tchurosbango", "tchurosbago", 2018, 100000);

        Concessionaria c1 = new Concessionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        
    }
}
