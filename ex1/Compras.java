public class Compras implements AreaInteressada {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < 5) {
            System.out.println("[Compras] ALERTA: " + nomeProduto
                    + " com estoque baixo (" + novaQuantidade + ")");
        }
    }
}
