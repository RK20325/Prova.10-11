import java.util.HashSet;
import java.util.Set;

public class Vendas implements AreaInteressada {
    private Set<String> zerados = new HashSet<>();
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade == 0) {
            zerados.add(nomeProduto);
        } else if (zerados.remove(nomeProduto)) {
            System.out.println("Vendas alerta: " + nomeProduto + " voltou a ter estoque (" + novaQuantidade + ")");
        }
    }
}
