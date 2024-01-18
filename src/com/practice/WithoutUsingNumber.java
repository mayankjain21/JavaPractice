package com.practice;

public class WithoutUsingNumber {

	public static void main(String[] args) {

		int ch='A'/'A';
		String x="..........";
		
		for(int i=ch;i<x.length()*x.length();i++) {
			System.out.println(i);
		}
		
		System.out.println(0.0/0.0);
	}

}
