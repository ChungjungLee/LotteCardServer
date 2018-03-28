package com.cjlee.lottecard.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjlee.lottecard.mapper.MemberMapper;
import com.cjlee.lottecard.vo.Member;

@Repository
public class MemberDAO {
	@Autowired
	SqlSession session;
	
	public int insertMember(Member member) {
		int result = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			
			result = mapper.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public ArrayList<Member> selectMember() {
		ArrayList<Member> result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			
			result = mapper.selectMember();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public ArrayList<Member> selectMemberByMonth(
			String firstDateInMonth, String lastDateInMonth, String sorting) {
		
		ArrayList<Member> result = null;
		
		HashMap<String, String> map = new HashMap<>();
		map.put("firstDate", firstDateInMonth);
		map.put("lastDate", lastDateInMonth);
		map.put("sorting", sorting);
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			
			result = mapper.selectMemberByMonth(map);
			
			for (Member m : result) {
				System.out.println(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public ArrayList<Member> searchMemberByName(String nameForSearch) {
		ArrayList<Member> result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			
			result = mapper.searchMemberByName(nameForSearch);
			
			for (Member m : result) {
				System.out.println(m);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
