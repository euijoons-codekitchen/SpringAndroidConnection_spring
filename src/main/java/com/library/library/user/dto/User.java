package com.library.library.user.dto;

public class User {

	private String email;
	private String passwd;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public void userDtoToString() {
		System.out.println("email : " + email + " passwd : " + passwd);
	}
	
}
