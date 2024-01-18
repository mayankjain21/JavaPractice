package Day1;

public class FindMissingNumber {

	public static void main(String[] args) {

		int num[]= {5,8,7,9,6,4,2,1};
		int s=FindMissingNum(num, 9);
		System.out.println(s);

	}
	
	public static int FindMissingNum(int num[], int ExpSum)
	{
	   int totalSum= ExpSum *((ExpSum+1)/2);	    
		int ActSum=0;		
		for(int i:num) {
			ActSum+=i;
		}
		
		return totalSum-ActSum;
	}

	
	
}
