package dia06.Desafio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorTarefas {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Tarefa> agenda = new ArrayList<>();
        int i, opcao = 1;
        while (opcao > 0) {
            int num = 1;
            System.out.println("\n");
            for (Tarefa t : agenda) {
                System.out.println(num + ". " + t.toString());
                num++;
            }

            System.out.println("\n1. Adicionar\n2. Concluir\n3. Editar Prioridade");
            System.out.println("0. Sair");
            System.out.print("Deseja realizar: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("\nFinalizado\n");
                    break;
                case 1:
                    agenda.add(Adicionar());
                    break;
                case 2:
                    System.out.println("\nEscolha a tarefa: ");
                    i = sc.nextInt();
                    Concluir(agenda.get(i));
                    break;
                case 3:
                    System.out.println("\nEscolha a tarefa: ");
                    i = sc.nextInt();
                    agenda.get(i).setPrio(EscolhaPrioridade());
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }
        }
        sc.close();
    }

    public static Tarefa Adicionar() {
        System.out.println("\nO nome da tarefa:");
        String nome = sc.next();
        Prioridade prio = EscolhaPrioridade();
        Tarefa nova = new Tarefa(nome, prio);
        return nova;
    }

    public static void Concluir(Tarefa aux) {
        aux.setConcluido(true);
    }

    public static Prioridade EscolhaPrioridade() {
        System.out.println("\n1. URGENTE\t2. FAZER\n3. EXISTE");
        System.out.println("A prioridade é: ");
        int n2 = sc.nextInt();
        if (n2 == 1)
            return Prioridade.URGENTE;
        else if (n2 == 2)
            return Prioridade.FAZER;
        return Prioridade.EXISTE;
    }
    
}
