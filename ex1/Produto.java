import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int quantidade;
    private List<AreaInteressada> areas = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void adicionarArea(AreaInteressada area) {
        areas.add(area);
    }

    public void removerArea(AreaInteressada area) {
        areas.remove(area);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade == this.quantidade) {
            return;
        }
        this.quantidade = novaQuantidade;
        notificar();
    }

    private void notificar() {
        for (AreaInteressada area : areas) {
            area.atualizar(nome, quantidade);
        }
    }
}
