package com.livingoncodes.test.Tutorial6;

public class Address {
	private String postcode;
	private String street;

	public Address() {

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
