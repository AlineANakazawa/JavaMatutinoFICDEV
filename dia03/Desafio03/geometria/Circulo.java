package dia03.Desafio03.geometria;

public class Circulo {
    private double raio;
    final double pi = 3.14;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calculaArea() {
        return 2 * pi * this.raio * this.raio;
    }
    
    public double calculaVolume() {
        return 4 * pi * this.raio * this.raio * this.raio / 3;
    }
    
    public double calculaAreaSuperficie() {
        return 4 * pi * this.raio * this.raio;
    }
}
