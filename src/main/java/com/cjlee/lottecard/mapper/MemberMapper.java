package com.cjlee.lottecard.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import com.cjlee.lottecard.vo.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	
	public ArrayList<Member> selectMember();
	
	public ArrayList<Member> selectMemberByMonth(HashMap<String, String> map);

	public ArrayList<Member> searchMemberByName(String nameForSearch);
}
