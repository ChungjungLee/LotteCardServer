package com.cjlee.lottecard.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjlee.lottecard.service.MemberService;
import com.cjlee.lottecard.vo.Member;
import com.google.gson.Gson;

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	/**
	 * Insert information of a member
	 * @param member
	 * @return
	 */
	@RequestMapping (value = "insertMember", method = RequestMethod.POST)
	public String insertMember(Member member) {
		logger.info("파라미터: " + member);
		
		String msg = "";
		if(memberService.insertMember(member)){
			msg = "Member Insert Success";
		}else{
			msg = "Member Insert Fail";
		}
		
		return msg;
	}
	
	@ResponseBody
	@RequestMapping (value = "selectMember", method = RequestMethod.GET, 
			produces="text/plain;charset=UTF-8")
	public String selectMember() {
		ArrayList<Member> list = memberService.selectMember();
		Gson gson = new Gson();
		
		String result = gson.toJson(list);
		return result;
	}
	
	/**
	 * Get members' information on the specified month
	 * @param month
	 * @return
	 */
	@ResponseBody
	@RequestMapping (value = "selectMemberByMonth", method = RequestMethod.GET, 
			produces="text/plain;charset=UTF-8")
	public String selectMemberByMonth(int year, int month, String sorting) {
		logger.info("selectMemberByMonth 파라미터: " + year + ", " + month + ", " + sorting);
		
		ArrayList<Member> list = memberService.selectMemberByMonth(year, month, sorting);
		Gson gson = new Gson();
		
		String result = gson.toJson(list);
		return result;
	}
	
	/**
	 * Get members' information matching with the name
	 * @param name
	 * @return
	 */
	@ResponseBody
	@RequestMapping (value = "searchMemberByName", method = RequestMethod.GET, 
			produces="text/plain;charset=UTF-8")
	public String searchMemberByName(String name) {
		System.out.println("search string: " + name);
		
		ArrayList<Member> list = new ArrayList<>();
		if (name.length() != 0) {
			list = memberService.searchMemberByName(name);
		}
		Gson gson = new Gson();
		
		String result = gson.toJson(list);
		return result;
	}
}
