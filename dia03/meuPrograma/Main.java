package dia03.meuPrograma;

import dia03.Geometria.Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(5, 10);
        
        double area = r.calcularArea();
        double perimetro = r.calcularPerimetro();
        
        System.out.println("Área do retãngulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}
