package com.library.library.member.service;

import com.library.library.member.Member;

public interface IMemberService {

	public void saveMember(Member member);
	public Member updateMember(Member member);
	public void deleteMember(Member member);
	public Member retriveMember(String mId);
}
