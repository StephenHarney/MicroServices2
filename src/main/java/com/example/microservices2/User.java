package com.example.microservices2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data//creates getters and setters and filed methods
@NoArgsConstructor//creates default constructors
@AllArgsConstructor//Sorts out all other constructors that is possible


public class User {
    private String userName;
    private String email;
}
