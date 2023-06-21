package dia12.Desafio12;

import java.util.Scanner;

public class MVCAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModeloAluno alunoM = new ModeloAluno();
        VisaoAluno alunoV = new VisaoAluno();
        ControleAluno alunoC = new ControleAluno(alunoM, alunoV);
            
        alunoC.exibirLista();
        System.out.print("\nEscolha o aluno: ");
        int id = sc.nextInt();
        alunoC.buscarAluno(id);
        System.out.print("Novo Coeficiente: ");
        double coeficiente = sc.nextDouble();
        sc.close();
        alunoC.atualizarCoeficiente(coeficiente);
    }
}