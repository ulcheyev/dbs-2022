package dao;

import entity.EmployeeEntity;
import jakarta.persistence.*;

import java.util.List;

public class EmployeeDAOPostgreSQL implements EmployeeDAO {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private EntityTransaction transaction;

    @Override
    public void addEmployee(EmployeeEntity employee) {
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();
        try {
            transaction.begin();
            entityManager.persist(employee);
            transaction.commit();
            entityManagerFactory.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public EmployeeEntity getEmployeeByEmployeeId(int id) {
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();

        TypedQuery<EmployeeEntity> q3 = entityManager.createQuery(
                "SELECT b FROM EmployeeEntity AS b WHERE (b.employeeId = :empid)",
                EmployeeEntity.class
        );
        q3.setParameter("empid", id);

        try {
            transaction.begin();
            EmployeeEntity result = q3.getSingleResult();
            transaction.commit();
            entityManagerFactory.close();
            return result;

        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public EmployeeEntity getEmployeeByEmail(String emailemp) {
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();

        TypedQuery<EmployeeEntity> q3 = entityManager.createQuery(
                "SELECT b FROM EmployeeEntity AS b WHERE (b.email = :email)",
                EmployeeEntity.class
        );
        q3.setParameter("email", emailemp);

        try {
            transaction.begin();
            EmployeeEntity result = q3.getSingleResult();
            transaction.commit();
            entityManagerFactory.close();
            return result;

        } catch (NoResultException e) {
            return null;
        }
    }


    @Override
    public List<EmployeeEntity> getAllEmployees() {

        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();

        TypedQuery<EmployeeEntity> q2 = entityManager.createQuery(
                "SELECT b FROM EmployeeEntity AS b",
                EmployeeEntity.class
        );

        transaction.begin();
        List<EmployeeEntity> results = q2.getResultList();
        transaction.commit();
        entityManagerFactory.close();
        return results;
    }

    @Override
    public void updateEmployee(String documentId, String employeeId, String fname, String lname, String age, String email, String workplace) {
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();
        transaction.begin();
        Query q = entityManager.createNativeQuery("update person set firstname = ?2, lastname = ?3, " +
                "age = ?4, email = ?5 where documentid = ?7");
        Query q2 = entityManager.createNativeQuery("update employee  set employeeid = ?1," +
                "workplace = ?6 where documentid = ?7");
        q.setParameter(7, Integer.parseInt(documentId));
        q2.setParameter(7, Integer.parseInt(documentId));
        q2.setParameter(1, Integer.parseInt(employeeId));
        q.setParameter(2, fname);
        q.setParameter(3, lname);
        q.setParameter(4, Short.parseShort(age));
        q.setParameter(5, email);
        q2.setParameter(6, workplace);
        q.executeUpdate();
        q2.executeUpdate();
        transaction.commit();
        entityManagerFactory.close();
    }

    @Override
    public void deleteEmployee(int documId) {
        EmployeeEntity e = new EmployeeEntity();
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();
        transaction.begin();
        Query q = entityManager.createNativeQuery("delete  from employee where documentid = ?1");
        q.setParameter(1, documId);
        q.executeUpdate();
        transaction.commit();
        entityManagerFactory.close();
    }

    @Override
    public EmployeeEntity getEmployeeByDocumentId(int id) {
        entityManagerFactory = DBUtil.createEntityManagerFactory();
        entityManager = DBUtil.createEntityManager();
        transaction = DBUtil.createTransaction();

        TypedQuery<EmployeeEntity> q3 = entityManager.createQuery(
                "SELECT b FROM PersonEntity AS b WHERE (b.documentid = :docid)",
                EmployeeEntity.class
        );
        q3.setParameter("docid", id);
        try {
            EmployeeEntity result = q3.getSingleResult();
            return result;
        } catch (NoResultException e) {
            return null;
        }
    }
}
