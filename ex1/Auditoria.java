public class Auditoria implements AreaInteressada {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("[Auditoria] " + nomeProduto
                + " -> nova quantidade: " + novaQuantidade);
    }
}
