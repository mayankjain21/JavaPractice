package Day1;

import java.util.ArrayList;

import java.util.List;


public class PosiNegi {

	public static void main(String[] args) {

		int ar[]= {-1,-2,9,-8,7,5};
		
		List<Integer> positIntegers=new ArrayList<Integer> ();
		List<Integer> negativeIntegers=new ArrayList<Integer> ();	
		
		
		for(int x:ar) {
			
			if(x>0) {
				positIntegers.add(x);
			}
			else {
				negativeIntegers.add(x);
			}
		}
		
		//System.out.println("Print potive number");
		
		for(int positIntegers1: positIntegers) {
			System.out.print(positIntegers1+" ");
			System.out.println();
		}
		
		System.out.println("Print Negative Number");
		for(int negativeIntegers1: negativeIntegers) {
			System.out.print(negativeIntegers1+" ");
		}
	}

}
