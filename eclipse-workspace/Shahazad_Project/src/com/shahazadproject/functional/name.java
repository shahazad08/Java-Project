package com.shahazadproject.functional;
import java.util.Scanner;

import com.shahazadproject.utilities.Utility;

import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");// TODO Auto-generated method stub
		n=sc.nextLine();
		Utility u=new Utility();
		
		System.out.println(((Utility) u).name(n));
		
				
		
				

	}

}
