package com.practice;

import java.util.ArrayList;

public class FindUniqueNumner {

	public static void main(String[] args) 
	{
		//Initialization of an array with integers.
		int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};
		
		//Initialization of an ArrayList to store unique numbers.
		ArrayList<Integer> ab = new ArrayList<Integer>();

		//The outer loop iterates through each element of the array.
		for (int i = 0; i < a.length; i++) 
		{
		    int k = 0;

		    // Check if the number is already in the ArrayList
		    if (!ab.contains(a[i]))
		    {
		        ab.add(a[i]); // Add the number to the ArrayList
		        k++;

		        // Check for duplicates in the remaining part of the array
		        for (int j = i + 1; j < a.length; j++) 
		        {
		            if (a[i] == a[j]) 
		            {
		                k++;
		            }
		        }

		        // If k is 1, then the number is unique
		        if (k == 1) {
		            System.out.println(a[i] + " is a unique number");
		        }
		    }
		}
	}
}


