package com.practice;

public class ReverseString {
	public static String reverseWords(String inputStr) {
        String[] words = inputStr.split("\\s+");
        StringBuilder reversedStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr.append(words[i]).append(" ");
        }
        return reversedStr.toString().trim();
	}
	public static void main(String args[])
	{
		String inputStr = "i like program language java to java language program like i in java";
        String result = reverseWords(inputStr);
        System.out.println(result);
	}

}
