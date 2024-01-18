package JavaTrickyQuestion;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3, 4, 5, 6};
	        int k = 7;
	        int result = countPairsWithSum(array, k);
	        System.out.println("Number of pairs with sum " + k + ": " + result);
	    }

	    private static int countPairsWithSum(int[] array, int k) {
	        Set<Integer> complementSet = new HashSet<>();
	        int count = 0;

	        for (int num : array) {
	            int complement = k - num;

	            if (complementSet.contains(complement)) {
	                count++;
	            }

	            complementSet.add(num);
	        }

	        return count;

	}

}
