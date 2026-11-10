public class Endereco {

    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private String numresidencia;

    public Endereco(String uf, String cidade, String cep, String logradouro, String numresidencia) {
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numresidencia = numresidencia;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank()){
            throw new IllegalArgumentException("UF invalido");
        }
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.isBlank()){
            throw new IllegalArgumentException("Cidade invalido");
        }
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep == null || cep.isBlank()){
            throw new IllegalArgumentException("CEP invalido");
        }
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro == null || logradouro.isBlank()){
            throw new IllegalArgumentException("Rua invalida");
        }
        this.logradouro = logradouro;
    }

    public String getNumresidencia() {
        return numresidencia;
    }

    public void setNumresidencia(String numresidencia) {
        if (numresidencia == null || numresidencia.isBlank()){
            throw new IllegalArgumentException("Numero residencial invalido");
        }
        this.numresidencia = numresidencia;
    }
}
