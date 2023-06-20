package dia11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Dia11");
        EntityManager em = factory.createEntityManager();
        
        ObraDeArte obra = new ObraDeArte();
        obra.setAutor("Adir Sodre");
        obra.setTitulo("Caminho de Sao Fancisco");
        obra.setProcedencia("Museu da Caixa D'agua");
        obra.setTipo("quadro");
        obra.setDataObra(parseData("25/11/1988"));
        obra.setTecnica("Oleo sobre tela");
        obra.setDimensoes("154cm x 154cm");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(obra);
        tx.commit();
        em.close();
        factory.close();
    }
    
    private static Calendar parseData(String data) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch(ParseException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
}
