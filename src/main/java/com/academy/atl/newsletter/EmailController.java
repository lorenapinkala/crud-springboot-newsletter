package com.academy.atl.newsletter;

import com.academy.atl.newsletter.dao.EmailDao;
import com.academy.atl.newsletter.models.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmailController {

    @Autowired
    private EmailDao emailDao;

    @PostMapping("/api/register")
    public void register(@RequestBody Email email){
        emailDao.save(email);
    }

    @GetMapping("/api/email/{id}")
    public Email getEmail(@PathVariable Long id){

        return emailDao.getEmail(id);
    }

    @GetMapping("/api/all/emails")
    public List <Email> getAll(){
        return emailDao.getAllEmail();
    }


    @DeleteMapping("/api/unsuscribe/{id}")
    public void deleteEmail(@PathVariable Long id){
        emailDao.delete(id);
    }
}
