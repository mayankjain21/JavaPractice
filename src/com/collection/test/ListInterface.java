package com.collection.test;

import java.util.ArrayList;
import java.util.List;


public class ListInterface {

	public static void main(String[] args) {


		List<String> list= new ArrayList<>();		
		
		list.add("Mayank");
		list.add("Chandni");
		list.add("Anika");
		list.add("Mayank");		
		list.add("Nikhil");		
		System.out.println(list);
		
		list.set(1, "Nikhil1");
		
		System.out.println(list);

	}

}
