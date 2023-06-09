package dia07.Desafio07;

public class Carro extends Automovel {
    private int rodas;
    private String transporta;
    
    public Carro() {
        super();
        this.rodas = 4;
        this.transporta = "pessoas e carga leve";
    }
    
    public void DefinirMotor(String motor) {
        super.setMotor(motor);
    }
        
    public String toString() {
        return "O CARRO é um " + super.toString() + " que transporta " + transporta;
    }
}
