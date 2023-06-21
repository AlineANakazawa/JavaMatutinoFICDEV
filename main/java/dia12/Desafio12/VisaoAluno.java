package dia12.Desafio12;

import java.util.List;

public class VisaoAluno {
    public static void exibirAluno(int id, String nome, double coeficiente) {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Coeficiente: " + coeficiente);
    }
    
    public static void exibirAlunos(List<ModeloAluno> lista) {
        for(ModeloAluno al : lista) {
            System.out.println(al.getId() + "\t" + al.getNome() + "\t" + al.getCoeficiente());
        }
    }
}
