package com.mythread;

public class TestingPriority extends Thread{
	private String name;

	public TestingPriority(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name);
		}
	}
public static void main(String[] args) {
	TestingPriority tp = new TestingPriority("jayati");
	TestingPriority tp1 = new TestingPriority("anshul");
	TestingPriority tp2 = new TestingPriority("nikita");
	tp.setPriority(1);
	tp1.setPriority(2);
	tp2.setPriority(3);
	tp.start();
	tp1.start();
	tp2.start();
}
}
