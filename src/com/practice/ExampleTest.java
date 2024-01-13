package com.practice;

public class ExampleTest {

    public static void main(String[] args) {

        char[] ar = {'m', 'o', 'm'};
        int n = ar.length;
        int i = 0, j = n - 1;

        while (i <= j) {

            if (ar[i] != ar[j]) {
                System.out.println("Not a palindrome");
                return;
            }

            i++;
            j--;
        }

        System.out.println("Palindrome");
    }
}
