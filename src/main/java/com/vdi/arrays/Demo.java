package com.vdi.arrays;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		String [] names =new String[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++)
		{
			System.err.println("Enter Names for Index :"+i);
			names[i]=sc.next();
		}
		
		
		for(int i=0;i<10;i++)
		{
			System.err.println("Names at Index :"+i+":"+names[i]);
		
		}
		
//		names[0]="Shyam";
//		names[1]="Ram";
//		names[3]="Shyam";
//		names[4]="Ram";
//		names[5]="Shyam";
//		names[6]="Ram";
//		names[7]="Shyam";
//		names[8]="Ram";
//		names[10]="Shyam";
//		
//		
//		String s1= names[0];
//		System.out.println(s1);
		
		sc.close();
	}
}
