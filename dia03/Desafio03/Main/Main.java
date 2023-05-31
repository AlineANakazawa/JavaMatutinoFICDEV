package dia03.Desafio03.Main;

import dia03.Desafio03.geometria.Circulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circulo circulo = new Circulo(0);
        
        System.out.print("Raio do círculo: ");
        double raio = input.nextDouble();
        circulo.setRaio(raio);
        
        double area = circulo.calculaArea();
        double volume = circulo.calculaVolume();
        double areaSuper = circulo.calculaAreaSuperficie();
        
        System.out.println("Área do círculo: " + area);
        System.out.println("Volume da esfera: " + volume);
        System.out.println("Área da superfície da esfera: " + areaSuper);
    }
}