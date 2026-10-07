public class Principal {

    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(21, 7);
        Retangulo r2 = new Retangulo(34, 12);
        Retangulo r3 = new Retangulo(67, 23);
        Retangulo r4 = new Retangulo(32, 44);
        Retangulo r5 = new Retangulo(65, 33);
        Retangulo r6 = new Retangulo(48, 34);

        FigurasGeometricas f1 = new FigurasGeometricas();
        FigurasGeometricas f2 = new FigurasGeometricas();

        f1.adicionarRetangulo(r1);
        f1.adicionarRetangulo(r2);
        f1.adicionarRetangulo(r3);

        System.out.println(f1.obterRetanguloMaiorArea());

        f2.adicionarRetangulo(r4);
        f2.adicionarRetangulo(r5);
        f2.adicionarRetangulo(r6);

        System.out.println(f2.obterRetanguloMaiorPerimetro());


    }
}
