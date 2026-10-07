public class Retangulo {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        setAltura(altura);
        setLargura(largura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if ( altura < 0){
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0){
            throw new IllegalArgumentException("Largura invalida");
        }
        this.largura = largura;
    }

    public double obterAreaRetangulo (){
        return altura * largura;
    }

    public double obterPerimetroRetangulo(){
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
