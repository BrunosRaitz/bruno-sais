public class Ex08 {
    public static void main(String[] args) {

        Contribuinte f1 = new Contribuinte("Jose", "12345678910", "AM", 30000);
        Contribuinte f2 = new Contribuinte("Carlos", "9999999999", "SC", 32000);
        Contribuinte f3 = new Contribuinte("Felix", "67676767676", "SP", 100000);
        Contribuinte f4 = new Contribuinte("Uelisson", "131313131313", "SP", 700000);
        Contribuinte f5 = new Contribuinte("Ivandel", "112233445566", "SC", 40000);

        Contribuinte contribuintes[] = {f1, f2, f3, f4, f5};


        double maiorImposto = 0;
        Contribuinte teste = null;
        for (int i = 0; i <contribuintes.length; i++){
            if (contribuintes[i].calculoImposto() > maiorImposto){
                maiorImposto = contribuintes[i].calculoImposto();
                teste = contribuintes[i];
            }
        }

        double impostoTotal = 0;
        for (int i = 0; i <contribuintes.length; i++){
             impostoTotal += contribuintes[i].calculoImposto();
        }

        //System.out.printf("%.2f ", teste.calculoImposto());;
        System.out.println(teste);
       // System.out.println();
        System.out.println("Imposto total dos 5 contribuintes: R$"+impostoTotal);
    }
}
