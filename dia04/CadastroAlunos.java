package dia04;

import javax.swing.JOptionPane;

public class CadastroAlunos {
    public static void main(String[] args) {
        String[][] alunos = new String[50][3];
        int qtdAlunos = 0;
        
        while(true) {
            String nome = JOptionPane.showInputDialog(null, 
                    "Digite o nome do aluno: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Digite a idade do aluno : "));
            double nota = Double.parseDouble(JOptionPane.showInputDialog(null, 
                    "Digite a nota do aluno: "));
            
            alunos[qtdAlunos][0] = nome;
            alunos[qtdAlunos][1] = Integer.toString(idade);
            alunos[qtdAlunos][2] = Double.toString(nota);
            qtdAlunos++;
            
            int opcao = JOptionPane.showConfirmDialog(null, 
                    "Deseja cadastrar outro aluno? ");
            if(opcao != JOptionPane.YES_OPTION) {
                break;
            }
        }
        
        String listaAlunos = "Lista de alunos:\n";
        double totalNotas = 0.0;
        for(int i = 0; i < qtdAlunos; i++) {
            listaAlunos += alunos[i][0] +  " - " + alunos[i][1] +
                    " anos - Nota: " + alunos[i][2] + "\n";
            totalNotas += Double.parseDouble(alunos[i][2]);
        }
        
        double mediaNotas = totalNotas / qtdAlunos;
        listaAlunos += "\nMédia das notas: " + mediaNotas;
        JOptionPane.showMessageDialog(null, listaAlunos);
    }
}
