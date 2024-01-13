package com.practice;


public class usecase {

   
	 public static void compare(int x, int y, int z) {
		 if (x >= y && x >= z) {
	            System.out.println(x + " is the first largest number");

	            if (y >= z) {
	                System.out.println(y + " is the second largest number");
	                System.out.println(z + " is the third largest number");
	            } else {
	                System.out.println(z + " is the second largest number");
	                System.out.println(y + " is the third largest number");
	            }
	        } else if (y >= x && y >= z) {
	            System.out.println(y + " is the first largest number");

	            if (x >= z) {
	                System.out.println(x + " is the second largest number");
	                System.out.println(z + " is the third largest number");
	            } else {
	                System.out.println(z + " is the second largest number");
	                System.out.println(x + " is the third largest number");
	            }
	        } else {
	            System.out.println(z + " is the first largest number");

	            if (x >= y) {
	                System.out.println(x + " is the second largest number");
	                System.out.println(y + " is the third largest number");
	            } else {
	                System.out.println(y + " is the second largest number");
	                System.out.println(x + " is the third largest number");
	            }
	        }
	    }


	    public static void main(String[] args) {
	        compare(5, 6, 7);
	    }
}