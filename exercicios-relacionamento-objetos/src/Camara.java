import java.util.ArrayList;
import java.util.List;

public class Camara {

    private List<Vereador> vereadores;

    public Camara(){
        vereadores = new ArrayList<>();
    }

    public void adicionarVereador(Vereador v){
        vereadores.add(v);
    }

    public double calcularMediaCamara(){
        double soma = 0;
        for (Vereador v : vereadores){
           soma += v.calcularDesempenhoVereador();
        }
        return soma / vereadores.size();
    }

    public List<Vereador> obterVereadoresAcimaDaMedia(){
        List<Vereador> obterVereadores = new ArrayList<>();
        double mediaDesempenhoCamara = calcularMediaCamara();
        for (Vereador v : vereadores){
            if (v.calcularDesempenhoVereador() > mediaDesempenhoCamara){
                obterVereadores.add(v);
            }
        }
        return obterVereadores;
    }
}
