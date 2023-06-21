package dia11.Desafio11;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("Estudante");
    
    public static void main(String[] args) {
        SelectAluno();
        System.out.print("\nEscolha o aluno: ");
        int cod = sc.nextInt();
        System.out.print("Valor do novo coeficiente: ");
        double coef = sc.nextDouble();
        atualizarCoeficiente(cod, coef);
        SelectAluno();
        sc.close();
        emf.close();
    }
    
    public static void SelectAluno() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT a FROM Aluno a ORDER BY ID");
        List<Aluno> list = query.getResultList();
        System.out.println("\nID\tNome Aluno\tCoeficiente");
        for(Aluno al : list)
            System.out.println(al.getId() + "\t" + al.getNome() + "\t" + al.getCoeficiente());
        em.close();
    }
    
    public static void atualizarCoeficiente(int id, double novoCoeficiente) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("UPDATE Aluno a SET a.coeficiente = :coef WHERE a.id = :id");
        query.setParameter("coef", novoCoeficiente);
        query.setParameter("id", id);
        query.executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
}