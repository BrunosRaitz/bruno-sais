public class Conta {

    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null | nomeTitular.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacarValor(double v){
        if (saldo < v || v < 1) {
            throw new IllegalArgumentException("Saldo invalido");
        }
            saldo = saldo - v;
            return v;
    }


    public void depositarValor (double v){
        if (v < 1){
            throw new IllegalArgumentException("Valor nao aceito");
        }
        saldo += v;
    }

    public void transferirValor( Conta c, double v){
        if (saldo < v || c == null){
            throw new IllegalArgumentException("Valor insuficiente em conta");
        }
        saldo -= v;
        c.saldo += v;
    }

    public double simularInvestimento(double v, int m) {
        if (m <= 0 || v <= 0) {
            throw new IllegalArgumentException("Erro, meses ou valor investido inválido");
        }
        return v * Math.pow(1.01, m);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
