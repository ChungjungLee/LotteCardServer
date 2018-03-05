package com.cjlee.lottecard.vo;

public class Utilrate {
	int id;
	int memberId;
	int year;
	int month;
	boolean isUsed;
	
	public Utilrate() {}
	
	public Utilrate(int id, int memberId, int year, int month, boolean isUsed) {
		this.id = id;
		this.memberId = memberId;
		this.year = year;
		this.month = month;
		this.isUsed = isUsed;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public boolean isUsed() {
		return isUsed;
	}
	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}
	
	@Override
	public String toString() {
		return "Utilrate [id=" + id + ", memberId=" + memberId + ", year=" + year + ", month=" + month + ", isUsed="
				+ isUsed + "]";
	}
	
}
