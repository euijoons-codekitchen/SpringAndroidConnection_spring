package com.library.library.member.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.library.member.Member;
import com.library.library.member.dto.MemberDto;
import com.library.library.member.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired
	MemberService mService;
	
	@RequestMapping(value = "/memJoin", method = RequestMethod.POST)
	@ResponseBody
	
	public String memJoin(@ModelAttribute("member") Member member) {	
	//public Member memJoin() {
	//이름과 비밀번호, 아이디, 이메일주소를 Member 입력받고 service로 저장
		//저장 후 Member로 그대로 리턴
		System.out.println("memJoin");
		System.out.println(member.getName());
		//System.out.println(map.get("name"));
		//ObjectMapper mapper = new ObjectMapper(); 
		Member dmember = new Member(member.getName(),member.getId(),member.getPw());
//		
		mService.saveMember(dmember);
//		
//		
		Member responseMember = mService.retriveMember(dmember.getId());
		responseMember.memberToString();
		System.out.println(responseMember.getName());
		return "hello";
		
	}
	
	@RequestMapping(value = "/memLogin", method = RequestMethod.POST)
	@ResponseBody
	public Member memLogin(@ModelAttribute("member") Member member) {
		//id, pw 기반으로 DB에서 검색해서 찾은 Member정보 전부 리
		
		Member dmember = mService.retriveMember(member.getId());
		if(dmember.getPw().equals(member.getPw())) {
			return dmember;
		}else
			return null;
		
	}
	
	@RequestMapping(value = "/memTest")
	@ResponseBody
	public String memTest() {
		System.out.println("엥?");
		return "test";
	}
	
}
