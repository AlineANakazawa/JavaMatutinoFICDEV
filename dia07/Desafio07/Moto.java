package dia07.Desafio07;

public class Moto extends Automovel {
    private int rodas;
    private String transporta;
    
    public Moto(int rodas) {
        super();
        this.rodas = rodas;
        this.transporta = "pessoas";
    }
    
    public void DefinirMotor(String motor) {
        super.setMotor(motor);
    }
        
    public String toString() {
        return "A MOTO é um " + super.toString() + " que transporta " + transporta;
    }
}
