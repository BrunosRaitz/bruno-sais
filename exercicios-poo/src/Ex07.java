public class Ex07 {

    public static void main(String[] args) {

        Aeronave aviao1 = new Aeronave("Airbus", 60, 900, 20000, 40);
        Aeronave aviao2 = new Aeronave("Boeing", 130, 1000, 26000, 60);
        Aeronave aviao3 = new Aeronave("F-35", 2, 1900, 10000, 40);
        Aeronave aviao4 = new Aeronave("MH-6 Little Bird", 5, 282, 235, 2);

        Aeronave aeronaves[] = {aviao1, aviao2, aviao3, aviao4};

        int maiorNumPassageiro = 0;
        Aeronave aeronovaMaiorNumPassageiros = null;
        for (int i = 0; i < aeronaves.length; i++){
            if (aeronaves[i].passageiros > maiorNumPassageiro){
                maiorNumPassageiro = aeronaves[i].passageiros;
                aeronovaMaiorNumPassageiros = aeronaves[i];
            }

        }
        System.out.println(aeronovaMaiorNumPassageiros);
    }

}
