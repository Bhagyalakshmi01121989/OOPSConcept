package org.system;

public class Axisbank extends Bankinfo{

	public void deposit() {
		System.out.println("deposit");
		
	}
	
	//Polymoriphism - overriding
	public static void main(String[] args) {
		Axisbank ab = new Axisbank();
		ab.deposit();
		
		Bankinfo bi = new Bankinfo();
		bi.deposit();
		
	}
}
