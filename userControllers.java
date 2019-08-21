package com.freshers.trainingApp.controller;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.freshers.trainingApp.model.users;
import com.freshers.trainingApp.repository.userRepo;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/users")
public class userControllers {

    @Autowired
    private com.freshers.trainingApp.service.userService userService;

    @PostMapping("/add")
    public String createUser(
            @RequestParam("name") String name,
            @RequestParam("department") String department,
            @RequestParam("repoting_manager") String repoting_manager,
            @RequestParam("age") Integer age,
            @RequestParam("salary") Integer salary
            ) {
        return userService.createUser(name,department,repoting_manager,age,salary);
    }

    @GetMapping("/list")
    public List<?> listUsers(){
        return userService.listUsers();
    }
    
    @DeleteMapping("/del/{id}")
    public String deleteById(@PathVariable(value="id")  String id) {
    	return  userService.delete_By_Id(id);
    	 
    }
    
    @PutMapping("/update/{id}")
    public String update( @PathVariable String id ,@RequestBody users user) {
        return userService.update(user);
    }
}
