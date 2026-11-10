public class Mensalista implements EstrategiaTarifa {
    private static final double VALOR_MENSAL = 250.00;

    @Override
    public double calcular(int minutos) {
        return VALOR_MENSAL;
    }
}
