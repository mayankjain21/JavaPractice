package LearnPattern;

public class CrossStarPattern {
	
	/* 
	   *   
	   *   
	   *   
	*******
	   *   
	   *   
	   *  		 
	 */

	public static void main(String[] args) {
		 int n = 7; // Must be odd

	        for (int i = 1; i  <=  n; i++) {
	            for (int j = 1; j  <=  n; j++) {
	                // Check if the current position is in the center row or center column
	                if (i == n / 2 || j == n / 2) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }
		
		
	}

}
