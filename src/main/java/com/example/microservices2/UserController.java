package com.example.microservices2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController  {

    private UserService emailService;


    @Autowired
    public UserController(UserService emailService){
        this.emailService = emailService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email) {
    emailService.sendEmail(name,email);
    return "Please Register here";



    //links: http://localhost:8080/registerUser/name/email
}






}
