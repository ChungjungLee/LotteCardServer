package com.cjlee.lottecard.mapper;

import java.util.ArrayList;

import com.cjlee.lottecard.vo.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	
	public ArrayList<Member> selectMember();
	
	public ArrayList<Member> selectMemberByMonth(int month);
}
