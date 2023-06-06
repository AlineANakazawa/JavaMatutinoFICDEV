package dia04.Desafio04;

import java.util.Scanner;

public class TempoLivre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        int horas = 0, minuto = 0;

        System.out.println("Escolha o que será feito hoje: ");
        while(opcao > 0) {
            System.out.println("1. Trabalhar\t2. Estudar\t3. Limpar");
            System.out.println("4. Cozinhar\t5. Dormir\t0. Finalizar");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            
            switch(opcao){
                case 0 :
                    System.out.println("Finalizando!");
                    break;
                case 1 :
                    horas += 6;
                    break;
                case 2 :
                    horas += 3;
                    break;
                case 3 :
                    horas += 1;
                    minuto += 30;
                    break;
                case 4 :
                    horas += 2;
                    minuto +=45;
                case 5 : 
                    horas += 8;
                    break;
                default :
                    System.out.println("Opção inválida!!");
                    break;
            }
            
            if(minuto >= 60) {
                horas += minuto / 60;
                minuto %= 60;
            }
        }
        
        Tempo t = new Tempo(horas, minuto);
        int h = t.CalculaRestoHora();
        int m = t.CalculaRestoMin();
        
        if(h > 0 || m > 0) 
            System.out.println(h + " hora(s) e " + m + " minuto(s) de tempo livre");
        else if(h == 0 && m == 0)
            System.out.println("Sem tempo livre");
        else
            System.out.println("Tempo insuficiente");
    }
}