public class Mercado {

    String nome;
    int vendasM;
    double precoM;
    int vendasL;
    double precoL;


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
