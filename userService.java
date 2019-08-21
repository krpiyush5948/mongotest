package com.freshers.trainingApp.service;

import com.freshers.trainingApp.model.users;
import com.freshers.trainingApp.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class userService {
    @Autowired
    private userRepo userRepo;

    public String createUser(String name, String department, String reporting_manager, Integer age,Integer salary){
        users user = new users(name,department,reporting_manager,age,salary);
        userRepo.save(user);
        return ("New user created with ID: "+ user.getId());
    }

    public List<users> listUsers(){
        return userRepo.findAll();
    }
    
    public String delete_By_Id(String id) {
    	userRepo.deleteById(id);
    	return "delete the given  id record";
    	
    	}
    public String update(users user) {
    	userRepo.save(user);
    	return "updated";
    }
}
