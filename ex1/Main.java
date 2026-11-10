public class Main {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        mouse.adicionarArea(compras);
        mouse.adicionarArea(vendas);
        mouse.adicionarArea(auditoria);

        mouse.setQuantidade(4);
        mouse.setQuantidade(0);
        mouse.setQuantidade(0);
        mouse.setQuantidade(8);  

        mouse.removerArea(compras);

        mouse.setQuantidade(3);  
    }
}
