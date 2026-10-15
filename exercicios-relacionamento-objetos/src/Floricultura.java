import java.util.ArrayList;
import java.util.List;

public class Floricultura {

    private List<Flores> flores;

    public Floricultura(){
        flores = new ArrayList<>();
    }

    public void adicionarFlor(Flores f){
        flores.add(f);
    }

    public List<Flores> obterFloresCliente(String nomeCliente){
        List<Flores> resultadoFlores = new ArrayList<>();

        for (Flores f : flores){
            if (f.getNomeCliente().equals(nomeCliente)){
                resultadoFlores.add(f);
            }
        }
        return resultadoFlores;
    }

}
