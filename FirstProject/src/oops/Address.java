package oops;

public class Address {
	private short houesNo;
	private String city;
	private String state;
	private int pincode;
	private String landmark;
	
	public Address(int houesNo, String city, String state, int pincode, String landmark) {
		this.houesNo = (short) houesNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.landmark = landmark;
	}
	public short getHouesNo() {
		return houesNo;
	}
	public void setHouesNo(short houesNo) {
		this.houesNo = houesNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	@Override
	public String toString() {
		return "Address [houesNo=" + houesNo + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", landmark=" + landmark + "]";
	}
	
	
	
	
}
