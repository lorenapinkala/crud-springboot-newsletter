package com.academy.atl.newsletter.dao;

import com.academy.atl.newsletter.models.Email;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class EmailDaoImp implements EmailDao{

    @PersistenceContext
    EntityManager entityManager;
    @Override

    public void delete(Long id) {

    }

    @Override
    public void save(Email email) {
        entityManager.merge(email);
    }

    @Override
    public List<Email> getAllEmail() {
        String query = "FROM Email";
        List<Email> result = entityManager.createQuery(query).getResultList();
        return result;
    }

    @Override
    public Email getEmail(Long id) {
        return  entityManager.find(Email.class, id);
    }

}
