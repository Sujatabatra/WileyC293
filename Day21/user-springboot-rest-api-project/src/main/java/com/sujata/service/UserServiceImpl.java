package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.entity.User;
import com.sujata.persistence.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User loginUser(User user) {
		
		return userDao.getUserByUserNameAndPassword(user.getUserName(), user.getPassword());
	}

}
