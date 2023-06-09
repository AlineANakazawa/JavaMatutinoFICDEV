package dia07.Desafio07;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao = -1;
        Scanner sc = new Scanner(System.in);
        while(opcao != 0) {
            System.out.println("1. Bicicleta\n2. Caminhão\n3. Carro");
            System.out.println("4. Carroça\n5. Charrete\n6. Moto");
            System.out.println("7. Triciclo\n0. Sair");
            System.out.print("Escolha o transporte: ");
            opcao = sc.nextInt();
            switch(opcao) {
                case 0  :
                    System.out.println("Finalizado");
                    break;
                case 1  :
                    Bicicleta bi = new Bicicleta();
                    System.out.println(bi.toString());
                    break;
                case 2  :
                    Caminhao cao = new Caminhao(8);
                    System.out.println(cao.toString());
                    break;
                case 3  :
                    Carro cro = new Carro();
                    System.out.println(cro.toString());
                    break;
                case 4  :
                    Carroca cra = new Carroca(4);
                    System.out.println(cra.toString());
                    break;
                case 5  :
                    Charrete ch = new Charrete(2);
                    System.out.println(ch.toString());
                    break;
                case 6  :
                    Moto m = new Moto(2);
                    System.out.println(m.toString());
                    break;
                case 7  : 
                    Triciclo t = new Triciclo();
                    System.out.println(t.toString());
                    break;
                default :
                    System.out.println("Opção inválida\n");
                    break;
            }
            System.out.println("\n");
        }
    }
}
