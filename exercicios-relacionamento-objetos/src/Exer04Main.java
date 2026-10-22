public class Exer04Main {

    public static void main(String[] args) {

        Produtos p1 = new Produtos("Rexona", "Desodorante aerosol", 25.99, 100);
        Produtos p2 = new Produtos("Monster", "Energetico", 8.99, 55);

        MateriaisConstrucao m1 = new MateriaisConstrucao();

        Produtos p3 = new Produtos("Dove", "Sabonete", 4.99, 200);
        Produtos p4 = new Produtos("Colgate", "Creme dental", 8.75, 80);
        Produtos p5 = new Produtos("Pantene", "Shampoo", 22.90, 60);
        Produtos p6 = new Produtos("Rexona", "Desodorante", 16.99, 120);


        m1.adicionarMaterial(p1);
        m1.adicionarMaterial(p2);
        m1.adicionarMaterial(p3);
        m1.adicionarMaterial(p4);
        m1.adicionarMaterial(p5);
        m1.adicionarMaterial(p6);

        System.out.println(m1.pesquisarProdutoMaisCaro("rexona"));
        System.out.println(m1.obterTodosProdutosDaMarcaPorPreco("rexona", 10, 100));
    }
}
