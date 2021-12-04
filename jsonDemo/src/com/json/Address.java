package com.json;

public class Address {
private String housenumber;	
private String city;
private String country;
private String State;
private long zipCode;
	public Address() {}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public Address(String housenumber, String city, String country, String state, long zipCode) {
		super();
		this.housenumber = housenumber;
		this.city = city;
		this.country = country;
		State = state;
		this.zipCode = zipCode;
	}
 
}
