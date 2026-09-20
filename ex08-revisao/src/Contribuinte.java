public class Contribuinte {

    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Erro, nome invalido.");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            System.out.println("Erro, CPF invalido.");
        } else {
            this.cpf = cpf;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()) {
            System.out.println("Erro, Unidade Federativa invalida.");
        } else {
            this.uf = uf;
        }
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual <= 0) {
            System.out.println("Erro, renda invalida.");
        } else {
            this.rendaAnual = rendaAnual;
        }
    }

    public double calcularAliquota() {
        return rendaAnual > 35000 ? 0.30 :
               rendaAnual > 25000 ? 0.275 :
               rendaAnual > 9000 ? 0.15 :
               rendaAnual > 4000 ? 0.058 : 0.0;
    }

    public double calcularImposto(){
        return rendaAnual * calcularAliquota();
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
