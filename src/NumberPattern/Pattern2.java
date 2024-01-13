package NumberPattern;

public class Pattern2 {

	public static void main(String[] args) {


		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		int nst=5,count=1;
		for(int i=1;i<=nst;i++)
		{
			for(int j=1;j<=nst;j++)
			{
				System.out.print(j);
				//count++;
			}			
			System.out.println();
		}

	}

}
