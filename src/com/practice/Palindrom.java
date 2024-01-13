package com.practice;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		  	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int num=sc.nextInt();
			
			int rev=0;
			int orig_num=num;
			while(num!=0) {
				rev=rev*10+num%10;
			    num=num/10;
			}
			if(orig_num==rev) {
				System.out.print("Palindrom");
			}
			else {
			System.out.print("Not Palindrom");
			}
		}		
	}
}
