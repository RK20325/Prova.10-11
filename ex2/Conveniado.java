public class Conveniado implements EstrategiaTarifa {
    private static final int MINUTOS_GRATIS = 30;
    private static final double VALOR_HORA = 8.00;
    private static final double DESCONTO_PERCENTUAL = 0.20; // 20%

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATIS);
        int horasIniciadas = (minutosCobrados + 59) / 60;
        double valorSemDesconto = horasIniciadas * VALOR_HORA;
        return valorSemDesconto * (1 - DESCONTO_PERCENTUAL);
    }
}
