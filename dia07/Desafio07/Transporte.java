package dia07.Desafio07;

public abstract class Transporte {
    private Tipo tipo;
    private String tracao;
    
    public Transporte(Tipo tipo, String tracao) {
        this.tipo = tipo;
        this.tracao = tracao;
    }
    
    public String toString() {
        return "TRANSPORTE " + tipo;
    }
}
