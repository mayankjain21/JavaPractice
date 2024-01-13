package LearnPattern;

public class NumericPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1 2 3 4 5 
		 2 3 4 5 
		  3 4 5 
		   4 5 
		    5 
		   4 5 
		  3 4 5 
		 2 3 4 5 
		1 2 3 4 5
		 */
		// Print the upper half of the pattern
		int n=5;
        for (int i = 1; i <= n; i++) {
            // Print spaces for each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers in ascending order
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
        
        
        for (int i = n; i>-1; i--) {
            // Print spaces for each row
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers in ascending order
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
	}

}
