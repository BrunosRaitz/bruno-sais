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

        if (rendaAnual > 35000.0){
            return  0.30;
        } else if (rendaAnual > 25000) {
            return  0.275;
        } else if (rendaAnual > 9000) {
            return  0.15;
        } else if (rendaAnual > 4000) {
            return  0.058;
        }else {
            return 0;
        }
    }
    public double calculoImposto(){
        return rendaAnual * calculoAliquota();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() != 11){
            throw new IllegalArgumentException("CPF cancelado");
        }else {
            this.cpf = cpf;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2){
            throw new IllegalArgumentException("UF invalida");
        }else {
            this.uf = uf;
        }
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0){
            throw new IllegalArgumentException("Renda Anual invalida");
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
