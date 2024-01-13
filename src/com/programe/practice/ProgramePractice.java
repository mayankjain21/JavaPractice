package com.programe.practice;

import java.util.Scanner;


public class ProgramePractice {

	public static void main(String[] args) {
		
		//Java Program to Print an Integer (Entered by the User)		
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * System.out.println("Enter the username"); String input=scanner.next();
		 * System.out.println(input);
		 */
		
		//Java Program to Add Two Integers
		
		/*
		 * int firstnum=10,secondnum=20,totalval; totalval=firstnum+secondnum;
		 * System.out.println(firstnum+"+" +secondnum+ ""+"="+totalval);
		 */
		
		//Java Program to Multiply two Floating Point Numbers
		
		/*
		 * float fl=1.5f,f2=2.5f; float total=fl*f2;
		 * System.out.println("Total value of flot number is"+total);
		 */

		
		//Java Program to Find ASCII Value of a character
		
		/*
		 * char ch='b'; int asciivalue=ch;
		 * System.out.println("The ASCII value of b is="+asciivalue);
		 */
		
		//Java Program to Compute Quotient and Remainder
		
		/*
		 * int dividend = 25, divisor = 4; int quotient = dividend / divisor; int
		 * remainder = dividend % divisor;
		 * System.out.println("the quotient is:="+quotient);
		 * System.out.println("the remainder is:="+remainder);
		 */

		
		//Java Program to Swap Two Numbers
		/*
		 * int x=15,y=10;
		 * System.out.println("Before swapping the number of x:="+x+"And y is ="+y);
		 * x=x+y; y=x-y; x=x-y;
		 * System.out.println("After swapping the number of x="+x+"and y:="+y);
		 */
		
		
		
		//Java Program to Check Whether a Number is Even or Odd
		/*
		 * Scanner scnScanner=new Scanner(System.in);
		 * System.out.println("Enter the number"); int input=scnScanner.nextInt();
		 * if(input%2==0) { System.out.println("The number is even"); } else {
		 * System.out.println("The number is not odd"); }
		 */
		
		//Java Program to Check Whether an Alphabet is Vowel or Consonant
		
		/*
		 * char ch='y'; if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'|| ch=='u') {
		 * System.out.println(ch+"is vovel" ); } else {
		 * System.out.println(ch+"is consonant"); }
		 */
		
		//Find Largest Among three numbers using if..else statement
		
		/*
		 * int x=555,y=78,z=8; if(x>y && x>z) {
		 * System.out.println("X is the largest number:="+x); } else if(y>z && y>x) {
		 * System.out.println("Y is the gretest number:="+y); } else {
		 * System.out.println("Z is the largest number:="+z); }
		 */
		
		
		//Check if a Number is Positive or Negative using if else
		
		/*
		 * int x=-1; if(x>=0) { System.out.println("Number is positive"); } else {
		 * System.out.println("Number is negative"); }
		 */
		
		//Java Program to Check Alphabet using if else
		
		/*
		 * char c = 'P'; if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		 * System.out.println(c + " is an alphabet."); else System.out.println(c +
		 * " is not an alphabet.");
		 */
		
		//Java Program to Calculate the Sum of Natural Numbers
		
		/*
		 * int num = 100, sum = 0; for(int i = 1; i <= num; ++i) { // sum = sum + i; sum
		 * += i; }
		 * 
		 * System.out.println("Sum = " + sum);
		 */
		
		//Java Program to Find Factorial of a Number		
		/*
		 * int fact=1,n=5; for(int i=1;i<=n;i++) { fact*=i; } System.out.println(fact);
		 */
		
		//Java Program to Generate Multiplication Table
		
		/*
		 * int n=10,table=5; for(int i=1;i<=n;i++) { int table1=table*i;
		 * System.out.println(+table+"*"+i+" Multiplication table is:="+table1); }
		 */
		
		//Java Program to Display Fibonacci Series
		
		/*
		 * int x=0,y=1,c; System.out.print(x+""+y); for(int i=2;i<=5;i++) { c=x+y;
		 * System.out.print(c); x=y; y=c; }
		 */
		
		//Java Program to Display Alphabets (A to Z) using loop
		
		/*
		 * char ch; for(ch='A';ch<='Z';ch++) { System.out.print(ch);
		 * System.out.print(" "); }
		 */
		
		
		//Java Program to Count Number of Digits in an Integer
		
		/*
		 * int x=123456789,sum=0; while(x>0) { x=x/10; sum++; } System.out.println(sum);
		 */
		
		
		//Java Program to Reverse a Number	
		/*
		 * int x=123456789,sum=0; while(x>0) { int rem=x%10; x=x/10; sum=sum*10+rem; }
		 * System.out.println(sum);
		 */
		
		//Java Program to check palindrome

		/*
		 * int x=131,rev=0; int temp=x; while(x>0) { int rem=x%10; x=x/10;
		 * rev=rev*10+rem; } System.out.println(rev); if(temp==rev) {
		 * System.out.println("The number is polindrom"); } else {
		 * System.out.println("The number is not polindrom"); }
		 */
		
		//Java Program to Check Whether a Number is Prime or Not
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * System.out.println("Enter the number"); int input=scanner.nextInt();
		 * 
		 * if(input%2!=0) { System.out.println("number is prime"); } else {
		 * System.out.println("number is not prime"); }
		 */
		
		
		//Java Program to Display Prime Numbers Between Two Intervals
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();
        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + " are:");
        // Iterate through the range and check for prime numbers
        for (int i = lowerLimit; i <= upperLimit; i++) {
            int j;
            for (j = 2; j * j <= i; j++)
                if (i % j == 0)
                    break;
            if (j * j > i && i > 1)
                System.out.print(i + " ");
        }

		scanner.close();	
	}
}
