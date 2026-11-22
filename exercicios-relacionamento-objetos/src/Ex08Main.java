public class Ex08Main {
    static void main() {

        Vereador v1 = new Vereador("Jamelao", "CV", 8, 4);
        Vereador v2 = new Vereador("Carlos", "MVP", 12, 7);
        Vereador v3 = new Vereador("Roberto", "FNP", 15, 9);
        Vereador v4 = new Vereador("Mariana", "FNP", 10, 6);
        Vereador v5 = new Vereador("Fernanda", "CV", 20, 13);
        Vereador v6 = new Vereador("Juliana", "MVP", 7, 3);
        Vereador v7 = new Vereador("Ricardo", "LDP", 18, 11);

        Camara c1 = new Camara();

        c1.adicionarVereador(v1);
        c1.adicionarVereador(v2);
        c1.adicionarVereador(v3);
        c1.adicionarVereador(v4);
        c1.adicionarVereador(v5);
        c1.adicionarVereador(v6);
        c1.adicionarVereador(v7);

        System.out.printf("%.2f%n", v5.calcularPorcemtagemProjetosAprovado());
        System.out.printf("%.2f%n", v4.calcularDesempenhoVereador());

        System.out.printf("%.2f%n", c1.calcularMediaCamara());
        System.out.println();

        System.out.println(c1.obterVereadoresAcimaDaMedia());

    }
}
