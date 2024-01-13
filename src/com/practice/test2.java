package com.practice;

public class test2 {

	public static void main(String[] args) {
		/*int [] x= {1,2,3,4,5,6,7,888,9,66,99,88,102};
		 int largest=x[0];
		 int smallest=x[0];
		 
		 for(int i=0;i<x.length;i++)
		 {
			 if(x[i]>largest) {
				 largest=x[i];
			 }
			 
			 if(x[i]<smallest) {
				 smallest=x[i];
			 }
		 }
		 System.out.println("Largest Number"+largest+"And Smallest number is"+smallest);*/
		
		
		/*String str="LAL5", rev="";
		int len=str.length();
		String Orig_String=str;
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(Orig_String.equals(rev)) {
			System.out.println("String is polindrom");
		}
		else {
			System.out.println("String is not polindrom");
		}*/
		//0,1,1,2,3,5,8,13
		/*int x=0,y=1,fib=10;
		//int z=x+y;
		System.out.print(+x+""+y+"");
		for(int z1=2;z1<fib;z1++) {
			int z=x+y;
			System.out.print(z);
			x=y;
			y=z;*/
		int number=123, sum=0,r;
		while(number>0) {
			r=number%10;
			sum=sum*10+r;
			number=number/10;
		}
		
		number=sum;
		System.out.println(number);
		while(number>0) {
			r=number%10;
		
		switch(r) {
			
		
		  case 1:
		      System.out.println("one");
		      break;
		  case 2:
			  System.out.println("two");
		      break;
		  case 3:
			  System.out.println("three");
		      break;
		  case 4:
			  System.out.println("four");
		      break;
		  case 5:
			  System.out.println("five");
		      break;
		  case 6:
			  System.out.println("six");
		      break;
		  case 7:
			  System.out.println("seven");
		      break;
		  case 8:
			  System.out.println("eight");
		      break;
		  case 9:
			  System.out.println("nine");
		      break;
		  case 0:
			  System.out.println("zero");
		      break;
		  default:
			  System.out.println("one");
		      break;
		
		}
		number=number/10;
		}
	}

}
