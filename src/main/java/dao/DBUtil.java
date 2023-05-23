package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DBUtil {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static EntityTransaction transaction;

    public static EntityManagerFactory createEntityManagerFactory() {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("cvut");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entityManagerFactory;
    }

    public static EntityManager createEntityManager() {
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

    public static EntityTransaction createTransaction() {
        transaction = entityManager.getTransaction();
        return transaction;
    }


}
