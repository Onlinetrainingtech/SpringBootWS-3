package com.example.EveSpringB2Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
    @Autowired
    private IUserDetails userDetails;
    
    @GetMapping(value="/user")
    public List<User>getUser()
    {
    	List<User>users=userDetails.findAll();
    	return users;
    }
}
