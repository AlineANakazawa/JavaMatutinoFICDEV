package dia07.Desafio07;

public class Carroca extends Transporte {
    private int rodas;
    private String transporta;
    
    public Carroca(int rodas) {
        super(Tipo.TERRESTRE, "animal");
        this.rodas = rodas;
        this.transporta = "carga leve";
    }
    
    public String toString() {
        return "A CAROÇA é um " + super.toString() + " que transporta " + transporta;
    }
}
