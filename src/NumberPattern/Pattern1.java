package NumberPattern;

public class Pattern1 {

	public static void main(String[] args) {


		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++)
			{
				System.out.print(1);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++)
			{
				System.out.print(2);
			}
			System.out.println();
		}
		
		int nstt=1;
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=nstt;j++)
			{
				System.out.print(2);
			}
			nstt++;
			System.out.println();
		}
		
		System.out.println();
		
		int nsttt=5,count=1;
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=2*i-1;j++)
			{
				System.out.print(count);
				count++;
			}
			System.out.println();
		}

	}

}
