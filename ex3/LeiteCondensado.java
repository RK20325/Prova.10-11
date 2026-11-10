public class LeiteCondensado extends Complemento {
    private static final double PRECO = 2.50;

    public LeiteCondensado(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite Condensado";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + PRECO;
    }
}
