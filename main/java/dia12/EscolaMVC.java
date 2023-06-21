package dia12;

public class EscolaMVC {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(" Fernanda Alves ", 25, " CIA223 ");
        AlunoVisao alunoVisao = new AlunoVisao();
        
        AlunoControle alunoControle = new AlunoControle(aluno, alunoVisao);
        alunoControle.exibirDetalhesAluno();
        alunoControle.atualizaDadosAluno(" Ana Cruz ", 23, " CIB261 ");
    }
}