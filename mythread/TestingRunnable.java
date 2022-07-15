package com.mythread;

public class TestingRunnable implements Runnable{
	private String name;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(i+name);
		}
	}

	public TestingRunnable(String name) {

		this.name = name;
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new TestingRunnable("jayati"));
		Thread t2 = new Thread(new TestingRunnable("chouhan"));
		t1.start();
		t2.start();
	}

}
