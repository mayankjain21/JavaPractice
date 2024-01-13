package LearnPattern;

public class Pattern8 {

	public static void main(String[] args) {

		int n=5,nsp=0,nst=1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=5;j>nsp;j--)
				
			{
				
				System.out.print(" ");
			}
			
			for(int k=0;k<nst;k++)
			{
				System.out.print("* ");
			}
			nsp++;
			nst++;
			System.out.println();
		}

		
		
		//System.out.println();
		
		for(int i=0;i<n;i++)
		{			
			for(int j=5;j>nsp;j--)				
			{				
				System.out.print(" ");
			}
			
			for(int k=0;k<nst-1;k++)
			{
				System.out.print("* ");
			}
			nsp--;
			nst--;
			System.out.println();
		}

	}

}
