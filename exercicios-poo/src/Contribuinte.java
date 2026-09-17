public class Contribuinte {

    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        /*this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;*/
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    public double calculoAliquota(){
        double aliquota;
        if (rendaAnual > 35000.0){
            aliquota = 0.30;
        } else if (rendaAnual > 25000) {
            aliquota = 0.275;
        } else if (rendaAnual > 9000) {
            aliquota = 0.15;
        } else if (rendaAnual > 4000) {
            aliquota = 0.58;
        }else {
            aliquota = 0;
        }
        return aliquota;
    }
    public double calculoImposto(){
        double imposto = rendaAnual * calculoAliquota();
        return imposto;
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            System.out.println("Erro. Nome invalido");
        }else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()){
            System.out.println("Erro. CPF cancelado");
        }else {
            this.cpf = cpf;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()){
            System.out.println("Erro. UF invalido");
        }else {
            this.uf = uf;
        }
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual <= 0){
            System.out.println("Erro. Renda Anual invalida");
        }else {
            this.rendaAnual = rendaAnual;
        }
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", uf='" + uf + '\'' +
                ", rendaAnual=" + rendaAnual +
                '}';
    }
}
