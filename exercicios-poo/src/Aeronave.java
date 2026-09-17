public class Aeronave {

    private String modelo;
    private int passageiros;
    private double velocidadeMax;
    private double capacidadeCombustivel;
    private double queimaCombustivel;

    public Aeronave(String modelo, int passageiros, double velocidadeMax, double capacidadeCombustivel, double queimaCombustivel) {
       /* this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivel = queimaCombustivel;*/
        setModelo(modelo);
        setPassageiros(passageiros);
        setVelocidadeMax(velocidadeMax);
        setCapacidadeCombustivel(capacidadeCombustivel);
        setQueimaCombustivel(queimaCombustivel);
    }

    @Override
    public String toString() {
        return "Aeronave{" +
                "modelo='" + modelo + '\'' +
                ", passageiros=" + passageiros +
                ", velocidadeMax=" + velocidadeMax +
                ", capacidadeCombustivel=" + capacidadeCombustivel +
                ", queimaCombustivel=" + queimaCombustivel +
                '}';
    }

    public double maiorTempoAr(){
        return capacidadeCombustivel / queimaCombustivel;
    }
    public double maiorDistanciaPercorrida(){
        return velocidadeMax * maiorTempoAr();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("Erro. Modelo invalido");
        }
        this.modelo = modelo;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {

        if (passageiros < 0){

            System.out.println("Erro. Quantidade invalida.");
        }else {
            this.passageiros = passageiros;
        }
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        if (velocidadeMax <= 0){
            System.out.println("Erro. Velocidade invalida");
        }else {
            this.velocidadeMax = velocidadeMax;
        }
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        if (capacidadeCombustivel <= 0){
            System.out.println("Erro. Quantidade invalida");
        }else {
            this.capacidadeCombustivel = capacidadeCombustivel;
        }
    }

    public double getQueimaCombustivel() {
        return queimaCombustivel;
    }

    public void setQueimaCombustivel(double queimaCombustivel) {
        if (queimaCombustivel <= 0){
            System.out.println("Erro. Queima de combustivel invalida");
        }else {
            this.queimaCombustivel = queimaCombustivel;
        }
    }
}
