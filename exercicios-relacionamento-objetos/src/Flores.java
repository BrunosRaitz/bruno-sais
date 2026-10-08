public class Flores {

    private String nomeFlor;
    private double precoFlor;
    private String nomeCliente;

    public Flores(String nomeFlor, double precoFlor, String nomeCliente) {
        setNomeFlor(nomeFlor);
        setPrecoFlor(precoFlor);
        setNomeCliente(nomeCliente);
    }

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {
        if (nomeFlor == null || nomeFlor.isBlank()){
            throw new IllegalArgumentException("Nome invaldio");
        }
        this.nomeFlor = nomeFlor;
    }

    public double getPrecoFlor() {
        return precoFlor;
    }

    public void setPrecoFlor(double precoFlor) {
        if (precoFlor <= 0){
            throw new IllegalArgumentException("Preço invalido");
        }
        this.precoFlor = precoFlor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isBlank()){
            throw new IllegalArgumentException();
        }
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Flores{" +
                "nomeFlor='" + nomeFlor + '\'' +
                ", precoFlor=" + precoFlor +
                ", nomeCliente='" + nomeCliente + '\'' +
                '}';
    }
}
