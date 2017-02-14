package com.lokhit.hibernate;

import java.util.List;

public class Person {

	private int pId;
	private String pName;
	private int age;
//	List<Address> address;

	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
//	public List<Address> getAddress() {
//		return address;
//	}
//	public void setAddress(List<Address> address) {
//		this.address = address;
//	}
}
