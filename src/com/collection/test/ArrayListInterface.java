package com.collection.test;

import java.util.ArrayList;

public class ArrayListInterface {

	public static void main(String[] args) {

		ArrayList<String> arrayList=new ArrayList<String>();
        
		arrayList.add("Hi");
		arrayList.add("Hi");
		System.out.println(arrayList);
		arrayList.set(1, "Jain");
		System.out.println(arrayList);
		arrayList.remove(1);
		System.out.println(arrayList);
		
			
		}
	}


