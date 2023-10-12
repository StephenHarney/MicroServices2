package com.example.microservices2;


import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController  {
    @PostMapping("registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUserBody(@RequestBody User user){
         System.out.println("User ID" +user.getUsername());
         System.out.println("User ID:"+user.getPassword());
         return user;

    }


}







