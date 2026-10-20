public class Produtos {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidade;

    public Produtos(String marca, String modelo, double preco, int quantidade) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()){
            throw new IllegalArgumentException("Marca invalida");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("Modelo invalido");
        }
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            throw new IllegalArgumentException("Preço invalido");
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0){
            throw new IllegalArgumentException("Quantia invalida");
        }
        this.quantidade = quantidade;
    }

    public void adicionarUnidadesProduto(int q){
        quantidade += q;
    }

    public boolean venderProduto(int v){
       if (v > quantidade || v <= 0){
            return false;
        }else {
            quantidade -=v;
            return true;
        }
    }



    @Override
    public String toString() {
        return "Produtos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
