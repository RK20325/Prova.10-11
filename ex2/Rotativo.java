public class Rotativo implements EstrategiaTarifa {
    private static final double VALOR_HORA = 8.00;

    @Override
    public double calcular(int minutos) {
        int horasIniciadas = (minutos + 59) / 60;
        return horasIniciadas * VALOR_HORA;
    }
}
