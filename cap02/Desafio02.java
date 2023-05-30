package cap02;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nome do produto: ");
        String nome = input.next();
        
        System.out.print("Quantidade em estoque: ");
        int estoque = input.nextInt();
        
        System.out.print("Preço:  ");
        float preco = input.nextFloat();
        
        System.out.print("Corredor: ");
        char corredor = input.next().charAt(0);
        
        System.out.print("Perecível: ");
        boolean perecivel = input.nextBoolean();
        
        System.out.print("O produto " + nome);
        if(perecivel) System.out.print(" é perecível");
        else System.out.print(" não é perecível");
        System.out.print(", possui " + estoque + " unidades disponíveis ");
        System.out.print("por R$" + preco + " cada ");
        System.out.println("e é encontrado no corredor " + corredor);
    }
}
