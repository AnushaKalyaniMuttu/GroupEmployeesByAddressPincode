package com.bean;

public class Address {

	private String streetName;
	private String place;
	private int pinCode;
	
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", place=" + place + ", pinCode=" + pinCode + "]";
	}
	public Address(String streetName, String place, int pinCode) {
		super();
		this.streetName = streetName;
		this.place = place;
		this.pinCode = pinCode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
}
