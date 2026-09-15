public class Aeronave {

    String modelo;
    int passageiros;
    double velocidadeMax;
    double capacidadeCombustivel;
    double queimaCombustivel;

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


}
