package org.system;

public class Students {
	
	int id = 12234;
	String name;
	String email;
	static double phonenumber;
	
	public void getstudentinfo() {
		id =12234;
	    name = "Bhagya";
		email = "Bhagya.com";
		phonenumber = 1234567890;	
		
	}
		
	 public static void main(String[] args) {
		Students st = new Students();
		st.getstudentinfo();
		
	}
}
