package com.livingoncodes.test.Tutorial6;

import java.util.List;

public class Patient {
	private int id;
	private String name;
	private int nationalId;

	private List<EmergencyContact> emergencyContacts;

	public Patient() {

	}

	public Patient(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}

	public List<EmergencyContact> getEmergencyContacts() {
		return emergencyContacts;
	}

	public void setEmergencyContacts(List<EmergencyContact> emergencyContacts) {
		this.emergencyContacts = emergencyContacts;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
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

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nationalId=" + nationalId + "]";
	}

	public void speak() {
		System.out.println("help me!");
	}

	
}
