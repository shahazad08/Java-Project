package com.shahazadproject.functional;
import java.util.Scanner;

import com.shahazadproject.utilities.Utility;

public class Subtraction {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 Nos");
		a=sc.nextInt();
		b=sc.nextInt();
		Utility u=new Utility();
		System.out.println("Subtraction is"+((Utility) u).sub(a,b));
		
				
		
			
		
				
		// TODO Auto-generated method stub

	}

}
