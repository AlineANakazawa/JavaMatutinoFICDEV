package dia07.Desafio07;

public abstract class Automovel extends Transporte {
    private String motor;
    
    public Automovel() {
        super(Tipo.TERRESTRE, "motora");
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    public String toString() {
        return "AUTOMÓVEL, que é um " + super.toString() + ",";
    }
}
