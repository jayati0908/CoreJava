package com.rays.mysync;


public class Racing extends Thread{
	public static Account a = new Account();
	public Racing(String name) {
		super(name);
	}
@Override
public void run() {
	for (int i = 0; i < 5; i++) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.deposit(getName(), 1000);
	}
}
public static void main(String[] args) {
	Racing r = new  Racing("jayati");
	Racing r1 = new Racing("ashu");
	r.start();
	r1.start();
}
}
