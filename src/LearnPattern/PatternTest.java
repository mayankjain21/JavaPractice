package LearnPattern;

public class PatternTest {

	public static void main(String[] args) {


		int n=5,nsp=0,nst=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<nsp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=nst;k++) {
				System.out.print("* ");
			}
			nsp++;
			nst--;
			System.out.println();
		}

		int nstt=2,nspp=3,n1=5;
		for(int i=1;i<n1;i++)
		{
			for(int j=1;j<=nspp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=nstt;k++)
			{
				System.out.print("* ");
			}
			nstt++;
			nspp--;
			System.out.println();
		}
	}

}
