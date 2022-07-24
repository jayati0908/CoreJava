package com.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Contestants extends Thread{
	public String phone = null;
	public String name;
	public Contestants(String n , String p) {
		name = n;
		phone = p;
			
	}
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Contestants> l = new  ArrayList<Contestants>();
		l.add(new Contestants("Jayati", "9912345678"));
		l.add(new Contestants("Ashu", "9912342222"));
		l.add(new Contestants("Prajjwal", "9912345770"));
		l.add(new Contestants("Karan", "9912345678"));
		l.add(new Contestants("Jitendra", "9912345888"));
		l.add(new Contestants("Sargam", "9912345111"));
		l.add(new Contestants("Divyansh", "11"));
		l.stream().map(e->e.phone);//get the phone numbers
		l.stream().map(e->e.phone).filter(e->e.length()==10);//get valid phone numbers
		l.stream().map(e->e.phone).filter(e->e.length()==10).distinct();//remove duplicate numbers
		l.stream().map(e -> e.phone).filter(e -> e.length() ==10).distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		}));//shuffle phone numbers
		l.stream().map(e -> e.phone).filter(e -> e.length() ==10).distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(3);//get three winners
		
		System.out.println("winners are_______");
		Thread.sleep(2000);
		l.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(e->{System.out.println(e);});
	}
}
