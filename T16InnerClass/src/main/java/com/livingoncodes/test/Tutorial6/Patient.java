package com.livingoncodes.test.Tutorial6;

import java.util.List;

public class Patient {
	private int id;
	private String name;
	private EmergencyContact criticalContract;

	private List<EmergencyContact> emergencyContacts;

	public Patient() {

	}

	public Patient(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}

	public EmergencyContact getCriticalContract() {
		return criticalContract;
	}

	public void setCriticalContract(EmergencyContact criticalContract) {
		this.criticalContract = criticalContract;
	}

	public List<EmergencyContact> getEmergencyContacts() {
		return emergencyContacts;
	}

	public void setEmergencyContacts(List<EmergencyContact> emergencyContacts) {
		this.emergencyContacts = emergencyContacts;
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
		return "Patient [id=" + id + ", name=" + name + ", criticalContract=" + criticalContract
				+ ", emergencyContacts=" + emergencyContacts + "]";
	}

	public void speak() {
		System.out.println("help me!");
	}

}
