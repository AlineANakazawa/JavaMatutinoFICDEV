package dia03.Desafio03.Rodar;

import dia03.Desafio03.Equacao.SegundoGrau;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SegundoGrau equacao = new SegundoGrau(1, 2, 5);

        System.out.print("Digite o x: ");
        int x = input.nextInt();
        System.out.println("O y da equação é " + equacao.CalculaY(x));
    }
}
