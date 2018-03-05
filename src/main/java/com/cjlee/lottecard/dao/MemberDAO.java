package com.cjlee.lottecard.dao;

import java.util.ArrayList;

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
	
	public ArrayList<Member> selectMemberByMonth(int month) {
		ArrayList<Member> result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			
			result = mapper.selectMemberByMonth(month);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
