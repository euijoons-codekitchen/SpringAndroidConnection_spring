package com.library.library.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.library.user.dao.UserDao;
import com.library.library.user.dto.User;

@Service
public class UserService {

	@Autowired
	UserDao dao;
	
	public void saveMember(User dto) {
		dao.insert(dto.getEmail(), dto);
	}
	
	public User searchMember(String email) {
		return dao.retrieve(email);
	}
	
}
