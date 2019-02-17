package com.library.library.member.dao;

import com.library.library.member.Member;

public interface IMemberDao {

	public void insert(Member member);
	public Member update(Member member);
	public void delete(Member member);
	public Member search(String mId);
}
