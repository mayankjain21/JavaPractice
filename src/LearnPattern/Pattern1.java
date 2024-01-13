package LearnPattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		*
		**
		***
		****
		*****
		 */
		
		int n=5, nst=1;
		for(int i=1;i<n;i++) {
			
			for (int j=1;j<=nst;j++)
			{
				System.out.print("*");
			}
			nst++;
			System.out.println();
		}

	}

}
