public class Caramelo extends Complemento {
    private static final double PRECO = 2.00;

    public Caramelo(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Caramelo";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + PRECO;
    }
}
