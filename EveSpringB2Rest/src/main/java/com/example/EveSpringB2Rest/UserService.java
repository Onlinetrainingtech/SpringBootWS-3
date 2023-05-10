package com.example.EveSpringB2Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserDetails
{

	@Override
	public List<User> findAll() {
		ArrayList<User>users=new ArrayList<>();
		
		users.add(new User(1001,"azar","azar@gmail.com"));
		users.add(new User(1002,"azar1","azar1@gmail.com"));
		users.add(new User(1003,"azar2","azar2@gmail.com"));
		return users;
	}
   
}
