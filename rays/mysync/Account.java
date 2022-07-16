package com.rays.mysync;

public class Account {
	private int bal = 0;

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}
	public void deposit(String msg,int amt) {
		synchronized(this) {
		int b = getBal()+amt;
		setBal(b);
		
		System.out.println(msg + " "+ b);
	}
	}

}
