package projedata.Employeer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *  main class
 */
public class App 
{
    public static void main( String[] args )
    {
        new Seed();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql-employeers");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        @SuppressWarnings("unchecked")
        List<Funcionario> tableValues = entityManager.createQuery("FROM Funcionario").getResultList();
        entityManager.close();
        System.out.print(tableValues.size());
    }
}
