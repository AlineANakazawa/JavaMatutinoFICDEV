package dia07.Desafio07;

public class Caminhao extends Automovel {
    private int rodas;
    private String transporta;
    
    public Caminhao(int rodas) {
        super();
        this.rodas = rodas;
        this.transporta = "carga pesada";
    }
    
    public void DefinirMotor(String motor) {
        super.setMotor(motor);
    }
        
    public String toString() {
        return "O CAMINHÃO é um " + super.toString() + " que transporta " + transporta;
    }
}