public class Mercado {

    String nome;
    int vendasM;
    double precoM;
    int vendasL;
    double precoL;

    public Mercado(String nome, int vendasM, double precoM, int vendasL, double precoL) {
        this.nome = nome;
        this.vendasM = vendasM;
        this.precoM = precoM;
        this.vendasL = vendasL;
        this.precoL = precoL;
    }

    public double calcularReceitaMaca(){
        double receitaM;
        return receitaM = precoM * vendasM;
    }

    public double calcularReceitaLaranja(){
        double receitaL;
        return receitaL = precoL * vendasL;
    }

    public double calcularReceitaTotal(){
        return calcularReceitaLaranja() + calcularReceitaMaca();
    }
}
