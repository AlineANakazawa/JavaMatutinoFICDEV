package dia04;

import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int n = input.nextInt();
        boolean primo = true;
        
        if( n == 0 || n == 1) primo = false;
        else if(n % 2 != 0) {
            for(int i = 3; i <= Math.sqrt(n); i+=2) {
                if(n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        else if(n > 2) primo = false;
        
        if(primo) System.out.println("É primo");
        else System.out.println("Não é primo");
    }
}
