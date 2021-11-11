package com.xworkz.dto;

import java.io.Serializable;

public class AmazonDto implements Serializable{
	private String userName;
	private String password;
	private String email;
	private String age;
	private String phoneNo;
	private String address;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AmazonDto [userName=" + userName + ", password=" + password + ", email=" + email + ", age=" + age
				+ ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}

	

		
	
	
	

}
