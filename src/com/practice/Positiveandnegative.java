package com.practice;

public class Positiveandnegative {

	public static void main(String[] args) {
		
		        int[] numbers = { -2, 0, 5, -7, 8, 0, 1 };

		        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

		        for (int number: numbers)
		        {
		            if (number > 0)
		                positiveCount++;
		            else if (number < 0)
		                negativeCount++;
		            else
		                zeroCount++;
		        }
		       System.out.println("Positive Count:"+positiveCount);
		       System.out.println("Negative Count: "+negativeCount);
		       System.out.println("Zero Count: "+zeroCount);
		    }
		}

