package dia09.Desafio09;

import java.util.Scanner;

public class Excecoes {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o numerador: ");
        String sx = sc.next();
        int x = VerificaTipo(sx);
        System.out.print("Digite o denominador: ");
        String sy = sc.next();
        int y = VerificaTipo(sy);
        Dividir(x, y);
    }

    public static int VerificaTipo(String s) {
        try {
            int n = Integer.parseInt(s);
            return n;
        } catch(NumberFormatException e) {
            System.out.println("Número Estranho!");
        }
        return 0;
    }

    public static void Dividir(int x, int y) {
        try {
            int resultado = x / y;
            System.out.println("\nA divisão deu " + resultado);
        } catch(ArithmeticException e) {
            System.out.println("Não é possível dividir");
        }
    }
}
