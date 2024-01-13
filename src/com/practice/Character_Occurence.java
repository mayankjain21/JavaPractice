package com.practice;

public class Character_Occurence {

	public static void main(String[] args) {
		String c="mynameismayankjain";
		int total_count=c.length();
		int totalcount_afterremove=c.replace("a", "").length();
		int count=total_count-totalcount_afterremove;
		System.out.println(count);
	}

}
