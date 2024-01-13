package com.practice;

public class Naturalnumber {

	public static void main(String[] args) {


		/*int n=56,count=0;
		while(n!=0) {
			n=n/10;
			count=count+1;
		}
		System.out.println(count);*/
		
		/*int n=5,fact=1;
		
		for(int i=1;i<=n;i++) 
		{
			fact=fact*i;
		}
		System.out.println(fact);*/
		
		
		int n=1261,rev=0;
		int temp=n;
		while(n>0) {
			int tr=n%10;
			n=n/10;
			rev=rev*10+tr;
		}
		if(rev==temp) {
			System.out.println("number is polindrom");
		}
		else
		{
			System.out.println("Number is not polindrom");
		}


	}

}


