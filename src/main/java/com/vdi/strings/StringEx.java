package com.vdi.strings;

public class StringEx {
	
	public static void main(String[] args) {
		String s1="FullStack";                // String Address stored in SCP
		String s2= new String("FullStack");   // Object Stored in heap area
	
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
