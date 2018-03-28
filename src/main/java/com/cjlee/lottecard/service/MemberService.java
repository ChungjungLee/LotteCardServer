package com.cjlee.lottecard.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

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
	
	public ArrayList<Member> selectMemberByMonth(int year, int month, String sorting) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(year, month, 1);
		
		String firstDateInMonth = format.format(calendar.getTime());
		
		calendar.set(year, month, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		String lastDateInMonth = format.format(calendar.getTime());
		
		return memberDAO.selectMemberByMonth(firstDateInMonth, lastDateInMonth, sorting);
	}

	public ArrayList<Member> searchMemberByName(String name) {
		String nameForSearch = name.charAt(0) + "%" + name.charAt(name.length()-1);
		
		return memberDAO.searchMemberByName(nameForSearch);
	}
}
