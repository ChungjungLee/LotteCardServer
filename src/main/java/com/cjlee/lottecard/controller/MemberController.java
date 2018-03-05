package com.cjlee.lottecard.controller;

import java.util.ArrayList;

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
	
	/**
	 * Insert information of a member
	 * @param member
	 * @return
	 */
	@RequestMapping (value = "insertMember", method = RequestMethod.POST)
	public String insertMember(Member member) {
		String msg = "";
		if(memberService.insertMember(member)){
			msg = "Member Insert Success";
		}else{
			msg = "Member Insert Fail";
		}
		
		return msg;
	}
	
	@ResponseBody
	@RequestMapping (value = "selectMember", method = RequestMethod.GET)
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
	@RequestMapping (value = "selectMemberByMonth", method = RequestMethod.GET)
	public String selectMemberByMonth(int month) {
		ArrayList<Member> list = memberService.selectMemberByMonth(month);
		Gson gson = new Gson();
		
		String result = gson.toJson(list);
		return result;
	}
}
