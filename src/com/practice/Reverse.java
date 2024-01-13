package com.practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number from keyboard");
			int num=sc.nextInt();
			int rev=0;
			while(num!=0) 
			{
				rev=rev*10+ num%10;
			    num=num/10;
			}
			System.out.println("Reverse number in "+ rev);
		}

	}

}
