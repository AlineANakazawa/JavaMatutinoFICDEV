package dia04;

import java.util.Scanner;

public class MenuBebidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha bebida: ");
        System.out.println("1. Água         ");
        System.out.println("2. Refrigerente ");
        System.out.println("3. Suco Natural ");
        System.out.println("4. Café         ");
        System.out.println("5. Chá          ");
        System.out.print  ("Digite opção:   ");
        int opcao = sc.nextInt();
        
        switch(opcao) {
            case  1 -> System.out.println(       "R$ 5,75");
            case  2 -> System.out.println(       "R$ 6,25");
            case  3 -> System.out.println(       "R$ 7,00");
            case  4 -> System.out.println(       "R$ 2,50");
            case  5 -> System.out.println(       "R$ 2,00");
            default -> System.out.println("Opção inválida");
        }
    }
}
