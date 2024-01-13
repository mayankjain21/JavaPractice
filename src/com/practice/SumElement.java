package com.practice;

public class SumElement
{

	public static void main(String[] args) 
	{	
		int [] a= {1,2,3,4,5};
		int sum=sumarray(a);
		System.out.println(sum);
	}

	public static int sumarray(int[] a)
	{
		int sum=0;
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]);
		 sum=sum+a[i];
	 }
	return sum;
	 
	}

}
