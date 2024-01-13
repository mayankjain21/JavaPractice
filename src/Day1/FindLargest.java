package Day1;

public class FindLargest {

	public static void main(String[] args) {
   
		int x=5,y=155,z=150;
		
		if(x>y && x>z) {
			System.out.println("X is the largest number:"+x);
		}
		else if (y>z && y>x) {
			System.out.println("Y is the largest number:"+y);
		}
		else {
			System.out.println("Z is the largest numner :"+z);
		}
        
		System.out.println();
		int arr[]= {1,2,3,4,5,66,7,8,9,55};
		int len=arr.length;
		
		int largest=arr[0];
		int secondlargest=arr[0];
		int thirdlargest=arr[0];
		
		 for (int i = 1; i < len; i++) {  // Start loop from index 1
	            if (arr[i] > largest) {	          
	                largest = arr[i];
	            } else if (arr[i] > secondlargest) {
	            	thirdlargest = secondlargest;
	                secondlargest = arr[i];
	            } else if (arr[i] > thirdlargest) {
	            	
	            	thirdlargest = arr[i];
	            }
	        }
		
		System.out.println(largest);
		System.out.println(secondlargest);
		System.out.println(thirdlargest);
	}

}
