package com.practice;


public class StringPalindrom {
	public static void main(String args[])
	{
		String st="LAL";
		String rev="";
		String Orig_String=st;
		int len=st.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+st.charAt(i);
		}
		if(Orig_String.equals(rev)) {
			System.out.println("String Polindrom");
		}
		else
		{
			System.out.println("String Not Polindrom");
		}
	}
}
