package dia12.Desafio12;

import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ControleAluno {
    private ModeloAluno alunoM;
    private VisaoAluno alunoV;
    
    public ControleAluno(ModeloAluno alunoM, VisaoAluno alunoV) {
        this.alunoM = alunoM;
        this.alunoV = alunoV;
    }
    
    public void atualizarCoeficiente(double coeficiente) {
        alunoM.setCoeficiente(coeficiente);
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();
        ss.merge(alunoM);
        t.commit();
        ss.close();
        sf.close();
        exibirDetalhes();
    }
    
    public void exibirDetalhes() {
        int id = alunoM.getId();
        String nome = alunoM.getNome();
        double coeficiente = alunoM.getCoeficiente();
        alunoV.exibirAluno(id, nome, coeficiente);
    }
    
    public void exibirLista() {
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session ss = sf.openSession();
        TypedQuery<ModeloAluno> query = ss.createQuery("FROM ModeloAluno", ModeloAluno.class);
        
        List<ModeloAluno> lista = query.getResultList();
        alunoV.exibirAlunos(lista);
        ss.close();
        sf.close();
    }
    
    public void buscarAluno(int id) {
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session ss = sf.openSession();
        Query query = ss.createQuery("FROM ModeloAluno a WHERE a.ID = :id", ModeloAluno.class);
        query.setParameter("id", id);
        alunoM = (ModeloAluno)query.uniqueResult();
        ss.close();
        sf.close();
    }
}
