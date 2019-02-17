package com.library.library.user.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.library.library.user.dto.User;

@Repository
public class UserDao {

	HashMap<String, User> map;
	
	public UserDao() {
		map = new HashMap<String, User>();
	}
	
	public void insert(String email, User dto) {
		map.put(email, dto);
	}
	public User retrieve(String email) {
		
		if(map.containsKey(email))
			return map.get(email);
		else
			return null;
	}
	
	
}
