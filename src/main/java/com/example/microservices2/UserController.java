package com.example.microservices2;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController  {
    @PatchMapping("RegisterUserBody")
    @ResponseBody(HttpStatus.CREATED)
    public User registerUserCredentials(@RequestBody User user){
         System.out.println("User ID" +user.getUsername());
         System.out.println("User ID:"+user.getClass());
         return user;

    }


}






}
