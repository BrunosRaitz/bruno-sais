public class Aeronave {

    private String modelo;
    private int passageiros;
    private double velocidadeMax;
    private double capacidadeCombustivel;
    private double queimaCombustivel;

    public Aeronave(String modelo, int passageiros, double velocidadeMax, double capacidadeCombustivel, double queimaCombustivel) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivel = queimaCombustivel;
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
        this.modelo = modelo;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getQueimaCombustivel() {
        return queimaCombustivel;
    }

    public void setQueimaCombustivel(double queimaCombustivel) {
        this.queimaCombustivel = queimaCombustivel;
    }
}
