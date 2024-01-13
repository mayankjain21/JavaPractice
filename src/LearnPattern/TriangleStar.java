package LearnPattern;



public class TriangleStar {

	public static void main(String[] args) {
		
		int n=8,nsp=8,nst=2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=nsp-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=nst*i-1;k++)
			{
				if(k==1||k==nst*i-1 ||i==8)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}			
			System.out.println();		
		}
		System.out.println();
		
		int n1=8,nspp=8,nstt=2;
		for(int i=1;i<=n1;i++)
		{
			
			for(int k=1;k<=nstt*i-1;k++)
			{
				if(k==1||k==nstt*i-1 ||i==8)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=1;j<=nspp-i;j++)
			{
				System.out.print(" ");
			}
			System.out.println();	
		
		}
		System.out.println();

	}

}
