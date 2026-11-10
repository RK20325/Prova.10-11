public class Main {
    public static void main(String[] args) {
        // 1-Espresso e Caramelo
        Bebida pedido1 = new Caramelo(new Espresso());

        // 2-Chá e Leite Condensado e Chantily
        Bebida pedido2 = new Chantily(new LeiteCondensado(new Cha()));

        // 3-Espresso e Caramelo repetido e Chantily
        Bebida pedido3 = new Chantily(new Caramelo(new Caramelo(new Espresso())));

        imprimir(1, pedido1);
        imprimir(2, pedido2);
        imprimir(3, pedido3);
    }

    private static void imprimir(int numero, Bebida pedido) {
        System.out.printf("Pedido %d: %s = R$ %.2f%n",
                numero, pedido.getDescricao(), pedido.getPreco());
    }
}
