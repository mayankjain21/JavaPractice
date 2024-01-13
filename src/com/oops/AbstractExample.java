package com.oops;

 abstract class  AbstractExample11 {
	
	   abstract void class2();
	 
	  abstract int class3();
	 
	  public void sleep() {
		    System.out.println("Zzz");
		  }
 
 }
	  
 class AbstractExample1 extends AbstractExample11 {
		  public void class2() {
		 
		    System.out.println("class2");
		  }
		  public int class3() {
				 
			    System.out.println("class3");
			    return 5;
			  }
		  
		  public void class4()
		  {
			  System.out.println("class4");
		  }
 }
 public class AbstractExample{
		
	
	 public static void main(String[] args)
	 {
		 
		 AbstractExample1 abstractExample1=new AbstractExample1();
		 abstractExample1.class2();
		 abstractExample1.class3();
		 abstractExample1.class4();
	 }
 }
 