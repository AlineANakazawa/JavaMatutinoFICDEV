package dia04.Desafio04;

public class Tempo {
    private int hora;
    private int minuto;

    public Tempo(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    public int CalculaRestoMin() {
        if(this.minuto > 0) {
            this.hora++;
            return 60 - this.minuto;
        }
        else return 0;
    }
    
    public int CalculaRestoHora() {
        return 24 - this.hora;
    }
}
