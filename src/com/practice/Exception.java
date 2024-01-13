package com.practice;

public class Exception {

	public static void main(String[] args) {
		
		        String[] array1 = { "Cats and ratsasdfasdf", "just rats and the just catest", "rats", "A" };
		        String shortString = array1[0];
		        String longString = array1[0];

		        // Code for Find Shortest and longest string in Array
		        for (String t : array1) {
		            if (shortString.length() > t.length())
		                shortString = t;
		            if (longString.length() < t.length())
		                longString = t;
		        }

		        System.out.println("Shortest string is: " + shortString);
		        System.out.println("Longest string is: " + longString);
		    }
		}


	
