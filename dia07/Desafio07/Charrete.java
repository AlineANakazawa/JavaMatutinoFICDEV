package dia07.Desafio07;

public class Charrete extends Transporte{
    private int rodas;
    private String transporta;
    
    public Charrete(int rodas) {
        super(Tipo.TERRESTRE, "animal");
        this.rodas = rodas;
        this.transporta = "pessoas";
    }
    
    public String toString() {
        return "A CHARRETE é um " + super.toString() + " que transporta " + transporta;
    }
}
