import java.util.List;

public class FlorMain {

    public static void main(String[] args) {

        Flores flor1 = new Flores("Rosa", 22, "Epaminondas");
        Flores flor2 = new Flores("violeta", 17, "Eusebio");
        Flores flor3 = new Flores("Girassol", 30, "Epaminondas");

        Floricultura f1 = new Floricultura();

        f1.adicionarFlor(flor1);
        f1.adicionarFlor(flor2);
        f1.adicionarFlor(flor3);

        System.out.println(f1.obterFloresCliente("Epaminondas"));

        List<Flores> compradas = f1.obterFloresCliente("Epaminondas");

        for (Flores f : compradas){
            System.out.println(f.getNomeFlor());
        }
    }
}
