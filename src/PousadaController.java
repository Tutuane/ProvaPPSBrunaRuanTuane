import java.util.ArrayList;
import java.util.List;

public class PousadaController {
    private List<Quarto> quartos;

    private static PousadaController instance;

    private PousadaController() {
        quartos = new ArrayList<>();
    }

    public static PousadaController getInstance() {
        if (instance == null) {
            instance = new PousadaController();
        }
        return instance;
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void removerQuarto(Quarto quarto) {
        quartos.remove(quarto);
    }

    public List<Quarto> listarQuartos() {
        return new ArrayList<>(quartos);
    }

    public void exibirInformacoesQuarto(Quarto quarto) {
        System.out.println("Informações do Quarto:");
        System.out.println("Quantidade de Camas: " + quarto.getQuantidadeCamas());
        System.out.println("Valor: " + quarto.getValor());
        System.out.println("Disponível: " + (quarto.isDisponivel() ? "Sim" : "Não"));
        System.out.println("------------------------");
    }
}
