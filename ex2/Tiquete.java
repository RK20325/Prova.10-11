public class Tiquete {
    private String placa;
    private int minutos;
    private EstrategiaTarifa estrategia;

    public Tiquete(String placa, int minutos, EstrategiaTarifa estrategia) {
        this.placa = placa;
        this.minutos = minutos;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaTarifa estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValor() {
        return estrategia.calcular(minutos);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }
}
