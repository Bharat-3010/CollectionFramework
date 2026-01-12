package com.vdi.arrays;

import java.util.Scanner;

public class IntArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[]= new int[10];
		
		for(int i=0; i<10 ; i++)
		{
			System.out.println("Enter number :"+i);
			num[i]=sc.nextInt();
		}
		
		for(int i=0; i<10 ; i++)
		{
			System.out.println("Entered Numbers are :"+num[i]);
		}
		
		sc.close();
	}

}
