package com.mythread;

public class TestingThreads extends Thread{
	private String name;
	public TestingThreads() {}
	public TestingThreads(String n) {
		name = n;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+name);//+" "+"jayati");
			//System.out.println(i);//+" "+"chouhan");
		}
	}
	public static void main(String[] args) {
		TestingThreads t1 = new TestingThreads("jayati");
		TestingThreads t2 = new TestingThreads("chouhan");
		t1.start();
		t2.start();
	}
}
