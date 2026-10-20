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

    
}
