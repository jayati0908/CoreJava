package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {
		List<String> items =  Arrays.asList("one","two","three","four","five","three","eight","one");
		Stream<String> st = items.stream();
		st.forEach(e->{System.out.println(e);});
		System.out.println("_____________");
		items.stream().sorted().forEach(e->{System.out.println(e);});
		System.out.println("_____limit____");
		items.stream().sorted().limit(3).forEach(e->{System.out.println(e);});
		System.out.println("____using distinct___");
		items.stream().distinct().forEach(e->{System.out.println(e);});
		//st.map(e->e.toUpperCase()).forEach(e->{System.out.println(e);});
		
	}

}
