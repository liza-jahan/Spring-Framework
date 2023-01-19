package com.livingoncodes.spring.web.dao;

public class Notice {
	private int id;
	private String name;
	private String email;
	
	
	
	public Notice() {
		
	}
	
	public Notice(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Notice(int id, String name, String email) {
		this.id = id;
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "Notice [id=" + id + ", name=" + name + ", email=" + email
				+"]";
	}

	
}
