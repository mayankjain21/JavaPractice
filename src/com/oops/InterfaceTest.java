package com.oops;

 interface test{
	
	public default void display()
	{
		System.out.println("display");
	}
	
}
 
 interface test1{
	 public default void display1()
	 {
		 System.out.println("display1");
	 }
 }

 
 class test2 implements test,test1
 {
	 public  void display2()
	 {
		 System.out.println("display2");
	 }
 }



public class InterfaceTest {

	public static void main(String[] args) {
	
		test2 ttTest2=new test2();
		ttTest2.display();
		ttTest2.display1();
		ttTest2.display2();
	}

}
