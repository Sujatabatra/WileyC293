package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.entity.User;
import com.sujata.service.UserService;

@RestController
public class UserResource {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/login/{uname}/{password}",produces = MediaType.APPLICATION_JSON_VALUE)
	public User loginResource(@PathVariable("uname") String userName,@PathVariable("password") String pwd) {
		return userService.loginUser(new User(userName, pwd));
	}
	
}
