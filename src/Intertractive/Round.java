package Intertractive;

import java.util.Arrays;

public class Round {

	public static void main(String[] args) {
		/*try {
		int data=100/0;
		System.out.println("hello");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		finally {
			System.out.println("rest of the code");
		}*/
		
		
		int arr[]= { -5, -4, -3, -2, 0, 2, 4, 6, 8 };
		
		int result[]=getSumPairZero(arr);
		
		if(result.length==0) {
			System.out.println("No Pair with zero");
		}
		else {
			System.out.println("Pair with some equal to zero"+Arrays.toString(result));
		}
		

	}

	private static int[] getSumPairZero(int[] arr) {

		for(int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==0) {
					return new int[]{arr[i], arr[j]};
				}
			}
		}
		
		return new int[]{};
	}

}
