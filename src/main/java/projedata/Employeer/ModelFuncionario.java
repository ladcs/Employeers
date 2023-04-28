package projedata.Employeer;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ModelFuncionario {
  public List<Funcionario> deletePerson (String name) {
    Funcionario entityToDelete = this.findByName(name);

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql-employeers");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    entityManager.getTransaction().begin();
    entityManager.remove(entityToDelete);
    entityManager.getTransaction().commit();
    
    entityManager.close();
    
    return this.findAll();
    
  }
  
  public Funcionario findByName(String name) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql-employeers");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    TypedQuery<Funcionario> query =entityManager.createQuery("SELECT f FROM Funcionario f WHERE f.name = :name", Funcionario.class);
    query.setParameter("name", name);
    Funcionario funcName = query.getSingleResult();
    entityManager.close();
    
    return funcName;
  }
  
  public List<Funcionario> findAll() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql-employeers");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    @SuppressWarnings("unchecked")
    List<Funcionario> allFunc = entityManager.createQuery("FROM Funcionario").getResultList();
    entityManager.close();
    
    return allFunc;
  }
  
  public List<Funcionario> updateRemuneration(Funcionario employeer, BigDecimal value) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-employeers");
    EntityManager em = emf.createEntityManager();
    
    employeer.setRemuneration(value);
    
    em.getTransaction().begin();
    em.merge(employeer);
    em.getTransaction().commit();
    
    return this.findAll();
  }
}
