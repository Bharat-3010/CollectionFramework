package com.collection.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Amol");
		list.add("Dipak");
		list.add("Sahil");
		list.add("Dipak");
		list.add("Shivraj");
		
		System.out.println(list);
		System.out.println(list.size());
		
		try {
		System.out.println(list.get(5));  // IndexOutOfBoundException
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list.get(4));
		
	    list.forEach(name-> System.out.println(name));    //Java 8 Featues
	   System.out.println("=========================");
	    list.forEach(System.out::println);               //java 8
	}

}
