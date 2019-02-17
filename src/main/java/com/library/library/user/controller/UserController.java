package com.library.library.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.library.user.dto.User;
import com.library.library.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	String TAG = UserController.class.getName();
	@Autowired
	UserService mService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public User login(@ModelAttribute("user") User dto) {
		System.out.println(TAG + "login");
		System.out.println(dto.getEmail());
		System.out.println(dto.getPasswd());
		User mDto = mService.searchMember(dto.getEmail());
		if(mDto!= null) {
			return mDto;
		}
		else {
			System.out.println("User Not Found");
			return null;
		}
		
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public String signup(@ModelAttribute("User") User user){
		
		System.out.println(TAG + "signup");
		System.out.println(user.getEmail());
		System.out.println(user.getPasswd());
		mService.saveMember(user);
		User mDto = mService.searchMember(user.getEmail());
		mDto.userDtoToString();
		if(mDto == null)
			System.out.println("dto is null");
		
		String result = "hello";
		try {
			result = new ObjectMapper().writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
