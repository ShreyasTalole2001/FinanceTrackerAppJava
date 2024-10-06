package com.example.finance.service;


import com.example.finance.model.Users;
import com.example.finance.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    Users user;

    @Autowired
    UserRepo repo;


    public void createUser(Users user){
        repo.save(user);
    }

}
