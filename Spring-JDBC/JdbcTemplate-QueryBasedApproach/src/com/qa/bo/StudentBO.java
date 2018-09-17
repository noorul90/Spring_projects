package com.qa.bo;

public class StudentBO {
	private int id;
	private String name;
	private long mobile;
	private String email;
	
	//2-arg constructor
	public StudentBO(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//3-arg constructor
	public StudentBO(String name, long mobile, String email) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	
	//4-arg constructor
	public StudentBO(int id, String name, long mobile, String email) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentBO [id=" + id + ", name=" + name + ", mobile=" + mobile
				+ ", email=" + email + "]";
	}
		
}
