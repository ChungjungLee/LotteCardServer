package com.cjlee.lottecard.vo;

public class Member {
	int id;
	String name;
	String telephone;
	String registeredDate;
	String registeredPlace;
	String issuedDate;
	boolean hasTmoney;
	boolean hasAutopay;
	
	public Member() {}
	
	public Member(int id, String name, String telephone, String registeredDate, String registeredPlace,
			String issuedDate, boolean hasTmoney, boolean hasAutopay) {
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.registeredDate = registeredDate;
		this.registeredPlace = registeredPlace;
		this.issuedDate = issuedDate;
		this.hasTmoney = hasTmoney;
		this.hasAutopay = hasAutopay;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
	public String getRegisteredPlace() {
		return registeredPlace;
	}
	public void setRegisteredPlace(String registeredPlace) {
		this.registeredPlace = registeredPlace;
	}
	public String getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}
	public boolean isHasTmoney() {
		return hasTmoney;
	}
	public void setHasTmoney(boolean hasTmoney) {
		this.hasTmoney = hasTmoney;
	}
	public boolean isHasAutopay() {
		return hasAutopay;
	}
	public void setHasAutopay(boolean hasAutopay) {
		this.hasAutopay = hasAutopay;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", telephone=" + telephone + ", registeredDate=" + registeredDate
				+ ", registeredPlace=" + registeredPlace + ", issuedDate=" + issuedDate + ", hasTmoney=" + hasTmoney
				+ ", hasAutopay=" + hasAutopay + "]";
	}
	
}
