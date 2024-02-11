package com.xworkz.stu.Repository;
import com.xworkz.stu.dto.StudentDto;
import javax.persistence.*;
import java.sql.Connection;

public class StudentRepoImpl implements StudentRepo {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("niveditha");
    EntityManager em = emf.createEntityManager();

    @Override
    public boolean validateAndAdd(StudentDto dto) {

        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(dto);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception in repo");
            transaction.rollback();
            return false;
        } finally {
            em.close();
            emf.close();
            System.out.println("closed resources");
        }
        System.out.println("data saved");
        return true;
    }


    @Override
    public StudentDto findByName(String name) {
        try {
            Query query = em.createNativeQuery("select*from StudentDto where name=?", StudentDto.class);
            query.setParameter(1, name);
            StudentDto dto = (StudentDto) query.getSingleResult();
            return dto;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception in repo");
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }

    @Override
    public boolean updateNameById(int id, String name) {
        String updateQuery = "update StudentDto set name =? where id = ?";
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Query query = em.createNativeQuery(updateQuery);
            query.setParameter(1, name);
            query.setParameter(2, id);
            int rowsUpdated = query.executeUpdate();
            transaction.commit();
            if (rowsUpdated > 0) {
                System.out.println("updated data");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            em.close();
            emf.close();
        }
        return false;
    }

    @Override
    public boolean deleteByName(String name) {
    EntityTransaction transaction =em.getTransaction();
    try {
    transaction.begin();
    String deleteQuery = "delete from StudentDto where name = ?";
    Query query = em.createNativeQuery(deleteQuery);
    query.setParameter(1, name);
    int rowsAffected = query.executeUpdate();
    transaction.commit();
   }catch (Exception e){
    e.printStackTrace();
    transaction.rollback();
}finally {
    em.close();
    emf.close();
}
        return false;
    }
    }




