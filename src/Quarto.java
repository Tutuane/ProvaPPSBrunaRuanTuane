public class Quarto implements Cloneable {
    private int quantidadeCamas;
    private double valor;
    private boolean disponivel;

    public Quarto(int quantidadeCamas, double valor) {
        this.quantidadeCamas = quantidadeCamas;
        this.valor = valor;
        this.disponivel = true;
    }

    public int getQuantidadeCamas() {
        return quantidadeCamas;
    }

    public double getValor() {
        return valor;
    }
    
    public void penalidade(double valor) {
    	this.valor += valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public boolean reservar() {
        if (disponivel) {
            disponivel = false;
            return true; // Reserva realizada com sucesso
        } else {
            return false; // Quarto já está reservado
        }
    }

    public void liberar() {
        disponivel = true;
    }

    @Override
    public Quarto clone() {
        try {
            return (Quarto) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}