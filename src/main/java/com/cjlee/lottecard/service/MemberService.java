package com.cjlee.lottecard.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjlee.lottecard.dao.MemberDAO;
import com.cjlee.lottecard.vo.Member;

@Service
public class MemberService {
	@Autowired
	MemberDAO memberDAO;
	
	
	public boolean insertMember(Member member) {
		if (memberDAO.insertMember(member) == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public ArrayList<Member> selectMember() {
		return memberDAO.selectMember();
	}
	
	public ArrayList<Member> selectMemberByMonth(int month) {
		return memberDAO.selectMemberByMonth(month);
	}
}
