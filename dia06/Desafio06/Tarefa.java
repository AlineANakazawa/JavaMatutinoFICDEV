package dia06.Desafio06;

public class Tarefa {
    private String nome;
    private Prioridade prio;
    private boolean concluido;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Prioridade getPrio() {
        return prio;
    }

    public void setPrio(Prioridade prio) {
        this.prio = prio;
    }
    
    public boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    
    public Tarefa(String nome, Prioridade prio) {
        this.nome = nome;
        this.prio = prio;
        this.concluido = false;
    }
    
    @Override
    public String toString() {
        if(this.concluido)
            //return "CONCLUÍDO\t" + prio + "\t" + nome;
            return nome + " " + prio + " CONCLUÍDO";
        else
            //return "PENDENTE\t" + prio + "\t" + nome; 
            return nome + " " + prio + " PENDENTE";
    }
}

