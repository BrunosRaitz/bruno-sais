public class Ex03 {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.nome = "Caderno";
        produto1.descricao = "Caderno em espiral tamanho médio";
        produto1.precoUnitario = 4.50;
        produto1.desconto = 15;

        produto2.nome = "Caneta ESF";
        produto2.descricao = "Caneta enferografica 5mm";
        produto2.precoUnitario = 1.20;
        produto2.desconto = 2;

        produto3.nome = "Esquadro";
        produto3.descricao = "Esquadro de acrílico 20 cm";
        produto3.precoUnitario = 2.35;
        produto3.desconto = 10;

        System.out.println("Produto1");
        System.out.println(produto1.nome+"\n"+produto1.descricao+"\nR$"+produto1.precoUnitario+"\n"+produto1.desconto+"%");
        System.out.println();
        System.out.println("Produto2");
        System.out.println(produto2.nome+"\n"+produto2.descricao+"\nR$"+produto2.precoUnitario+"\n"+produto2.desconto+"%");
        System.out.println();
        System.out.println("Produto3");
        System.out.println(produto3.nome+"\n"+produto3.descricao+"\nR$"+produto3.precoUnitario+"\n"+produto3.desconto+"%");

    }
}
