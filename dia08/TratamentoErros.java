package dia08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TratamentoErros {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        while(opcao != 0) {
            System.out.println("1. Divisão por 0");
            System.out.println("2. Formato do número errado");
            System.out.println("3.Throw");
            System.out.println("4. Arquivo não encontrado");
            System.out.println("5. Acessar posição não existente");
            System.out.println("6. Valor nulo\n0. Sair");
            System.out.print("Escolha erro: ");
            opcao = sc.nextInt();
            switch(opcao) {
                case 0 -> System.out.println("Finalizado");
                case 1 -> DivisaoP0(10, 0);
                case 2 -> TipoErrado();
                case 3 -> Throw();
                case 4 -> ArquivoSumido();
                case 5 -> ForaDosLimites();
                case 6 -> ValorNulo();
                default -> System.out.println("Opção inválida\n");
            }
        }
    }
    
    public static void DivisaoP0(int a, int b) throws Exception {
        try {
            int r = a / b;
            System.out.println(r);
        } catch(ArithmeticException e) {
            System.out.println("Não é possível dividir por 0");
        }
    }
    
    public static void TipoErrado() {
        try {
            System.out.println("O valor é: " + Integer.valueOf("as"));
        } catch(NumberFormatException e) {
            System.out.println("Número estranho!");
        } finally {
            System.out.println("Chegou no final!");
        }
    }
    
    public static void Throw() throws Exception {
        try {
            System.out.println("O valor é: " + Integer.parseInt(-1));
            throw new Exception();
        } finally {
            System.out.println("Chegou no final!");
        }
    }
    
    public static void ArquivoSumido() {
        try {
            FileInputStream fis = new FileInputStream("meuarquivo.sql");
        } catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
    
    public static void ForaDosLimites() {
        int myArray[] = {10, 25, 32, 41, 52};
        try {
            for(int i = 0; i <= myArray.length; i++)
                System.out.println(myArray[i]++);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Índice fora do array");
        }
    }
    
    public static void ValorNulo() {
        String s = null;
        try {
            int tam = s.length();
        } catch(NullPointerException e) {
            System.out.println("Vriável nula");
        }
    }
}
