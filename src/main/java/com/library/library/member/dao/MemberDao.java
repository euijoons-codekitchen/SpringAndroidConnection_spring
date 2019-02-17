package com.library.library.member.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.library.library.member.Member;

@Repository
public class MemberDao implements IMemberDao{

	HashMap<String, Member> map;
	
	public MemberDao() {
		// TODO Auto-generated constructor stub
		map = new HashMap<String, Member>();
	}
	
	@Override
	public void insert(Member member) {
		// TODO Auto-generated method stub
		map.put(member.getId(), member);
		
	}

	@Override
	public Member update(Member member) {
		// TODO Auto-generated method stub
		map.replace(member.getId(), member);
		Member updatedMember = map.get(member.getId());
		return updatedMember;
		
	}

	@Override
	public void delete(Member member) {
		// TODO Auto-generated method stub
		map.remove(member.getId());
		
	}

	@Override
	public Member search(String mId) {
		// TODO Auto-generated method stub
		Member foundMember = map.get(mId);
		
		return foundMember;
	}

	
	
}
