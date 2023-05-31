package dia03;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        
        System.out.print("Digite nome: ");
        String nome = input.next();
        System.out.print("Digite idade: ");
        int idade = input.nextInt();
        
        p1.setNome(nome);
        p1.setIdade(idade);
        
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
    }
}
