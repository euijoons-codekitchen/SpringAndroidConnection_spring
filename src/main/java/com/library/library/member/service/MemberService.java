package com.library.library.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.library.member.Member;
import com.library.library.member.dao.IMemberDao;
import com.library.library.member.dao.MemberDao;

@Service
public class MemberService implements IMemberService {
	@Autowired
	MemberDao dao;

	@Override
	public void saveMember(Member member) {
		// TODO Auto-generated method stub
		dao.insert(member);
		//member.memberToString();
	}

	@Override
	public Member updateMember(Member member) {
		// TODO Auto-generated method stub
		dao.update(member);
		Member newMember = dao.search(member.getId());
		return newMember;
	}

	@Override
	public void deleteMember(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member retriveMember(String mId) {
		// TODO Auto-generated method stub
		Member foundMember = dao.search(mId);
		return foundMember;
		
	}
	
	

}
