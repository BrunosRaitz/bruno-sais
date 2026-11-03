public class Exer05Main {
    public static void main(String[] args) {

        Conta c1 = new Conta("tchurusbando", 5000);
        Conta c2 = new Conta("jamelao", 450);

        System.out.println(c2.getSaldo());
        c2.transferirValor(c1, 300);
        System.out.println(c2.getSaldo());


    }
}
