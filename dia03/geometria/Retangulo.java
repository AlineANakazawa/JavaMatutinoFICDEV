package dia03.geometria;

public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return this.base * this.altura;
    }
    
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}