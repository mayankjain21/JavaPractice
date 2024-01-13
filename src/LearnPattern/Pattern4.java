package LearnPattern;

public class Pattern4 {
	
	public static void main(String args[]) {
		
		int n=5,nsp=1,nst=n/2+1;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=nst;j++)
			{
				System.out.print("*");
			}
			
			for(int k=1;k<=nsp;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=nst;l++)
			{
				System.out.print("*");
			}
			if(i<=n/2) {
				nst--;
				nsp=nsp+2;
			}
			else {
				nst++;
				nsp=nsp-2;
			}
			System.out.println();
		}
	}

}
