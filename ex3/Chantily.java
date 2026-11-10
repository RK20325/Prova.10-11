public class Chantily extends Complemento {
    private static final double PRECO = 3.00;

    public Chantily(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Chantily";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + PRECO;
    }
}
