package org.system;

public class Bankinfo {
	
	public void saving() {
		System.out.println("saving");
		
	}

	public void fixed() {
		System.out.println("fixed");
		
	}
	
	public void deposit() {
		System.out.println("deposit");
		
	}
	
	public static void main(String[] args) {
		Bankinfo bi = new Bankinfo();
		bi.saving();
		bi.fixed();
		bi.deposit();
	}
}
