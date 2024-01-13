package LearnPattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1
		 23
		 456
		 78910		 
		 */
		int n=4,nst=1,count = 1;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=nst;j++) 
			{
				System.out.print(count);
				count++;
			}
			nst++;
			//count++;
			System.out.println();
		}

	}

}
