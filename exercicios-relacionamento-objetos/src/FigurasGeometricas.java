import java.util.ArrayList;
import java.util.List;

public class FigurasGeometricas {

    private List<Retangulo> retangulos;

    public FigurasGeometricas(){
        retangulos = new ArrayList<>();
    }

    public void adicionarRetangulo(Retangulo r){
        retangulos.add(r);
    }

    public Retangulo obterRetanguloMaiorArea(){

        double maiorAreaRetangulo = Double.MIN_VALUE;
        Retangulo retanguloMaiorArea = null;

        for (Retangulo r : retangulos){
            if (r.obterAreaRetangulo() > maiorAreaRetangulo){
                maiorAreaRetangulo = r.obterAreaRetangulo();
                retanguloMaiorArea = r;
            }
        }
        return retanguloMaiorArea;
    }

    public Retangulo obterRetanguloMaiorPerimetro(){

        double maiorPerimetroRetangulo = Double.MIN_VALUE;
        Retangulo retanguloMaiorPerimetro = null;

        for (Retangulo r : retangulos){
            if (r.obterPerimetroRetangulo() > maiorPerimetroRetangulo){
                maiorPerimetroRetangulo = r.obterPerimetroRetangulo();
                retanguloMaiorPerimetro = r;
            }
        }
        return retanguloMaiorPerimetro;
    }
}
