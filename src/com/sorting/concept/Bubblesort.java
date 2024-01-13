package com.sorting.concept;

import javax.xml.transform.Templates;

public class Bubblesort {

	public static void main(String[] args) {

		int arr[] ={15,16,6,8,5};
		
		int arraylength=arr.length;
		
		for(int i=0;i<arraylength-1;i++) {
			for(int j=0;j<arraylength-1-i;j++)
			{
				//System.out.println(arr[i]);
				//System.out.println(arr[j+1]);
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		 // Print the sorted array
        System.out.println("Sorted Array:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
	}

}
