package dia07.Desafio07;

public class Bicicleta extends Transporte{
    private int rodas;
    private String transporta;
    private int adicional;
    
    public Bicicleta() {
        super(Tipo.TERRESTRE, "humana");
        this.rodas = 2;
        this.transporta = "pessoas";
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }
    
    public String toString() {
        return "A BICICLETA é um " + super.toString() + " que transporta " + transporta;
    }
}
