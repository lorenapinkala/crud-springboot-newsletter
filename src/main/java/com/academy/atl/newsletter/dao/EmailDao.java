package com.academy.atl.newsletter.dao;

import com.academy.atl.newsletter.models.Email;

import java.util.List;

public interface EmailDao {

    void delete(Long id);//delete

    void save(Email email);//post

   List<Email> getAllEmail(); //get

   Email getEmail(Long id);  //get


}
