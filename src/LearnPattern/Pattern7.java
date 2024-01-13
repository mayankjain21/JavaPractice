package LearnPattern;

public class Pattern7 {

	public static void main(String[] args) 
	{
		
		int nstt=1,nspp=0,n=5;		
		for(int i=0;i<=n;i++)
		{
			for(int j=5;j>nspp;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<nstt;k++)
			{
				System.out.print("* ");
			}
			nspp++;
			nstt++;
			System.out.println();
		}

	}

}
