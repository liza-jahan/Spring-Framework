package com.livingoncodes.spring.test3.TutorialEightF;

public class Address {
	private String postcode;
	private String street;

	public Address() {

	}
	
    public void Init()
    {
    	System.out.println("Address create : "+this);
    }
	
    public void Destroy() {
    	
    	System.out.println("Address destroy");
    }
	
	public Address(String postcode, String street) {

		this.postcode = postcode;
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [postcode=" + postcode + ", street=" + street + "]";
	}

}
