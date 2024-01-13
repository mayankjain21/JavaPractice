package com.practice;

public class FactRecursion {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=fact(5);
		System.out.println(x);
	}

	private static int fact(int i) {
		if(i==0)
		{
			return 1;
		}
		return i*fact(i-1);
	}
}
