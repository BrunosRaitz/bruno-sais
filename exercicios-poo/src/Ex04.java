public class Ex04 {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        c1.raio = 7;

        System.out.printf("%.2f", c1.obterArea());
        System.out.println();

        Circulo c2 = new Circulo();
        c2.raio = 10;

        System.out.printf("%.2f", c2.obterArea());
        System.out.println();

        Circulo c3 = new Circulo();
        c3.raio = 14;

        System.out.printf("%.2f", c3.obterArea());
        System.out.println();

        Circulo c4 = new Circulo();
        c4.raio = 18;

        System.out.printf("%.2f", c4.obterArea());
    }
}
