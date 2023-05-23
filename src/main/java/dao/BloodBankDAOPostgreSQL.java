package dao;

import entity.BloodbankEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class BloodBankDAOPostgreSQL implements BloodBankDAO {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private EntityTransaction transaction;


    @Override
    public void addBloodBank(BloodbankEntity bloodbank) {
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();
        try {
            transaction.begin();
            entityManager.persist(bloodbank);
            transaction.commit();
            entityManagerFactory.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public BloodbankEntity getBloodBankByName(String name) {
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();

        TypedQuery<BloodbankEntity> q3 = entityManager.createQuery(
                "SELECT b FROM BloodbankEntity AS b WHERE (b.name = :BloodbankEntityName)",
                BloodbankEntity.class
        );
        q3.setParameter("BloodbankEntityName", name);
        BloodbankEntity result = q3.getSingleResult();
        return result;
    }

    @Override
    public List<BloodbankEntity> getAllBloodBanks() {
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();
        TypedQuery<BloodbankEntity> q2 = entityManager.createQuery(
                "SELECT b FROM BloodbankEntity AS b",
                BloodbankEntity.class
        );

        List<BloodbankEntity> results = q2.getResultList();
        return results;
    }


    public BloodbankEntity getBloodBankById(int id) {
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();

        TypedQuery<BloodbankEntity> q3 = entityManager.createQuery(
                "SELECT b FROM BloodbankEntity AS b WHERE (b.id = :BloodbankEntityId)",
                BloodbankEntity.class
        );
        q3.setParameter("BloodbankEntityId", id);
        BloodbankEntity result = q3.getSingleResult();
        return result;
    }

}
