package com.rays.abs;

public class Bussinessman implements Socialworker, Richman {

		public void earnMoney() {	
		
		System.out.println("earn money");
	}

	
	public void donation() {
		System.out.println("donation");
	}

		public void party() {
			System.out.println("Party");
	}

	@Override
	public void helpToOthers() {
		// TODO Auto-generated method stub
		System.out.println("help to others");
	}

	public static void main(String[] args) {
		Bussinessman rm = new Bussinessman();
		rm.donation();
		rm.earnMoney();
		rm.helpToOthers();
		rm.party();
		System.out.println("____________________");

		
	}
}
