public class Reserva {
    private String nomeHospede;
    private Quarto quarto;
    private int numeroPessoas;
    private int diasReserva;

    public Reserva(String nomeHospede, Quarto quarto, int numeroPessoas, int diasReserva) {
        this.nomeHospede = nomeHospede;
        this.quarto = quarto;
        this.numeroPessoas = numeroPessoas;
        this.diasReserva = diasReserva;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public int getDiasReserva() {
        return diasReserva;
    }
}
