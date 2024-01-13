package LearnPattern;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JoinRowSet;

public class hill {

	public static void main(String[] args) {

    int [] arr= {1,-2,3,-4,5,-6};
    
    List<Integer> positiveIntegers = new ArrayList<Integer>();
    List<Integer> negativeIntegers = new ArrayList<Integer>();
    
    	for (Integer number : arr) {
    		
    		if(number>0) {
    			positiveIntegers.add(number);
    		}
    		else {
				negativeIntegers.add(number);
			}
			
		}
    	
    	for (Integer negativeIntegers1 : negativeIntegers) {
			System.out.print(negativeIntegers1+"");
		}
    	System.out.println();
    	
    	for (Integer positiveIntegers1 : positiveIntegers) {
			System.out.print(positiveIntegers1+"");
		}
    	System.out.println();
    	
    
	}
	
	
	
	
	
	


}
