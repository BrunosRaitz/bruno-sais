import java.util.ArrayList;
import java.util.List;

public class MateriaisConstrucao {

    private List<Produtos> materiais;

    public MateriaisConstrucao(){
        materiais = new ArrayList<>();
    }

    public void adicionarMaterial(Produtos p){
        materiais.add(p);
    }

    public Produtos pesquisarProdutoMaisCaro(String m){
        Produtos produtoMaisCaro = null;
        double maiorPreco = 0;
        for (Produtos p : materiais){
            if (p.getMarca().equalsIgnoreCase(m)){
                if (p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public List<Produtos> obterTodosProdutosDaMarcaPorPreco (String m, double x, double y){
        List<Produtos> buscaProdutos = new ArrayList<>();
        for (Produtos p : materiais){
            if (p.getMarca().equalsIgnoreCase(m)) {
                if (p.getPreco() >= x && p.getPreco() <= y) {
                    buscaProdutos.add(p);
                }
            }
        }
        return buscaProdutos;
    }

}
