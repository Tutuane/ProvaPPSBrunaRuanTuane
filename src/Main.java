import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pousada pousada = new Pousada();

        Quarto quarto1 = new Quarto(2, 100.0);
        Quarto quarto2 = new Quarto(1, 80.0);
        Quarto quarto3 = new Quarto(3, 150.0);

        pousada.adicionarQuarto(quarto1);
        pousada.adicionarQuarto(quarto2);
        pousada.adicionarQuarto(quarto3);

        List<Quarto> quartos = pousada.listarQuartos();
        for (Quarto quarto : quartos) {
            pousada.exibirInformacoesQuarto(quarto);
        }

        Reserva reserva1 = new ReservaBuilder("João", quarto1.clone())
                .setNumeroPessoas(2)
                .setDiasReserva(5)
                .build();
        
        Reserva reserva2 = new ReservaBuilder("Maria", quarto1.clone())
                .setNumeroPessoas(2)
                .setDiasReserva(5)
                .build();
        
        System.out.println("Hospede 1 ->" + reserva1.getNomeHospede());
        System.out.println("Valor ->" + reserva1.getQuarto().getValor());
        System.out.println("Hospede 2 ->" + reserva2.getNomeHospede());
        System.out.println("Valor ->" + reserva2.getQuarto().getValor());
        
        System.out.println("Hóspedem 1 sofreu penalidade de 600 reais");
        reserva1.getQuarto().penalidade(600);
        System.out.println("Hospede 1 ->" + reserva1.getNomeHospede());
        System.out.println("Valor ->" + reserva1.getQuarto().getValor());
        System.out.println("Hospede 2 ->" + reserva2.getNomeHospede());
        System.out.println("Valor ->" + reserva2.getQuarto().getValor());
    }
}
