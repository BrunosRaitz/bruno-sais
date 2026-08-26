public class ClassePrincipal {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        Veiculo carroDeHomen = new Veiculo();

        v1.marca = "Honda";
        v1.modelo = "Civic";
        v1.placa = "xgr33gbx";
        v1.ano = 2011;
        v1.preco = 67000;


        carroDeHomen.marca = "Volkswagen";
        carroDeHomen.modelo = "Gol";
        carroDeHomen.placa = "676767";
        carroDeHomen.ano = 2014;
        carroDeHomen.preco = 55000;

        System.out.println(v1.ano+" | "+ v1.preco+"\n");
        System.out.println(carroDeHomen.modelo+" | "+carroDeHomen.preco);

    }
}
