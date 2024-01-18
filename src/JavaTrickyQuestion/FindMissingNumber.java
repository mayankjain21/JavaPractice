package JavaTrickyQuestion;

public class FindMissingNumber {

	public static void main(String[] args) {


		int [] arr= {1,2,3,5};
		int mis=Missingnum(arr, 5);
		System.out.println("Missing number is:"+mis);

	}
	
	public static int Missingnum(int num[], int n)
	{
		
		int sum=0;		
		n=n*((n+1)/2);
		
		for(int i:num) {
			sum+=i;
		}
		System.out.println("Total sum of array element is:="+sum);
		
		return n-sum;
	
	
	}

}
