package com.shahazadproject.functional;

import java.util.Scanner;

import com.shahazadproject.utilities.Utility;

public class Addition {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Nos");
		a=sc.nextInt();
		b=sc.nextInt();
		
		Utility u=new Utility();
		System.out.println("Addition is"+((Utility) u).add(a,b));
		
		
		
		
	
				
		// TODO Auto-generated method stub

	}

}
