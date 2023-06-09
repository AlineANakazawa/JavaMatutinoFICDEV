package dia07.Desafio07;

public class Triciclo extends Transporte{
    private int rodas;
    private String transporta;
    
    public Triciclo() {
        super(Tipo.TERRESTRE, "humana");
        this.rodas = 3;
        this.transporta = "pessoas";
    }
    
    public String toString() {
        return "A BICICLETA é um " + super.toString() + " que transporta " + transporta;
    }
}
