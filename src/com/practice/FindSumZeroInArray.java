package com.practice;

import java.util.Arrays;

public class FindSumZeroInArray {
	
	public static int[] getSumPairZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 0) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        // Return an array with two elements, indicating no pair found
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = { -5, -4, -3, -2, 0, 2, 4, 6, 8 };
        int[] result = getSumPairZero(array);
        //System.out.println(result);

        if (result.length == 0) {
            System.out.println("No pair found with sum equal to zero");
        } else {
            System.out.println("Pair with sum equal to zero: " + Arrays.toString(result));
        }
    }

}
