package LearnPattern;

public class Pattern6 {

	public static void main(String[] args) {

        int nsp=0,nst=6;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<nsp;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<nst;k++)
			{
				System.out.print("* ");
			}
			nsp++;
			nst--;
			System.out.println();
		}

		
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
