public class Funcionario {

    String identificacao;
    String nome;
    String sobrenome;
    double salarioM;
    int aumento;


    public double obterSalarioAnual(){
        return salarioM * 12;
    }

    public String obterNomeCompleto(){
        return nome+" "+sobrenome;
    }

    public double obterAumento(int porcentual){
        double aumento = porcentual * salarioM / 100;
        return salarioM + aumento;
    }

}
