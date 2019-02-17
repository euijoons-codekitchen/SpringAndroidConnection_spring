package com.library.library.member;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Member implements Serializable {

	private String name;
	private String id;
	private String pw;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String id, String pw) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void memberToString() {
		System.out.println("name : " + name + " id : " + id + " pw : " + pw);
	}

}
