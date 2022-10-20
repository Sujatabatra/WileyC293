package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.entity.User;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public User loginUser(User user) {
		
		return restTemplate.getForObject("http://localhost:8084/login/"+user.getUserName()+"/"+user.getPassword(), User.class);
	}

}
