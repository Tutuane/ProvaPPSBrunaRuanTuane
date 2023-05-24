public class ReservaBuilder {
    private String nomeHospede;
    private Quarto quarto;
    private int numeroPessoas;
    private int diasReserva;

    public ReservaBuilder(String nomeHospede, Quarto quarto) {
        this.nomeHospede = nomeHospede;
        this.quarto = quarto;
    }

    public ReservaBuilder setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
        return this;
    }

    public ReservaBuilder setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
        return this;
    }

    public Reserva build() {
        return new Reserva(nomeHospede, quarto, numeroPessoas, diasReserva);
    }
}
