import java.util.List;

public class Pousada {
    private PousadaController pousadaController;

    public Pousada() {
        pousadaController = PousadaController.getInstance();
    }

    public void adicionarQuarto(Quarto quarto) {
        pousadaController.adicionarQuarto(quarto);
    }

    public void removerQuarto(Quarto quarto) {
        pousadaController.removerQuarto(quarto);
    }

    public List<Quarto> listarQuartos() {
        return pousadaController.listarQuartos();
    }

    public void exibirInformacoesQuarto(Quarto quarto) {
        pousadaController.exibirInformacoesQuarto(quarto);
    }
}