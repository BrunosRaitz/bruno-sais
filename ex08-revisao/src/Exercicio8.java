public class Exercicio8 {

    static void main() {

        Contribuinte f1 = new Contribuinte("Jose", "12345678910", "AM", 30000);
        Contribuinte f2 = new Contribuinte("Carlos", "9999999999", "SC", 32000);
        Contribuinte f3 = new Contribuinte("Felix", "67676767676", "SP", 100000);
        Contribuinte f4 = new Contribuinte("Uelisson", "131313131313", "SP", 700000);
        Contribuinte f5 = new Contribuinte("Ivandel", "112233445566", "SC", 40000);

        Contribuinte contribuintes[] = {f1, f2, f3, f4, f5};

        double maiorImposto = 0;
        Contribuinte contribuinteMaiorImposto = null;

        for (Contribuinte c : contribuintes) {
            double impostoAtual = c.calcularImposto();

            if (impostoAtual > maiorImposto) {
                maiorImposto = impostoAtual;
                contribuinteMaiorImposto = c;
            }
        }
        double impostoTotal = 0;
        for (Contribuinte c : contribuintes) {
            impostoTotal += c.calcularImposto();
        }
        /*for (int i = 0; i < contribuintes.length; i++){
            double impostoAtual = contribuintes[i].calcularImposto();
            if (impostoAtual > maiorImposto){
                maiorImposto = impostoAtual;
                contribuinteMaiorImposto = contribuintes[i];
            }
        }*/

        if (contribuinteMaiorImposto != null){
            System.out.println(contribuinteMaiorImposto+"\nimposto: R$"+maiorImposto);
        }
        System.out.println("Imposto total: R$" + impostoTotal);

    }
}
