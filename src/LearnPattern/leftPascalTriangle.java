package LearnPattern;

public class leftPascalTriangle {

	public static void main(String[] args) {

		int n=10,nsp=10,nst=1;
		for(int i=0;i<n;i++) {
			for(int j=1;j<nsp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=nst;k++) {
				System.out.print("*");
			}
			nst++;
			nsp--;
			System.out.println();
		}
		int n1=10,nsp1=1,nst1=9;
		for(int i=0;i<n1;i++) {
			for(int j=1;j<=nsp1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=nst1;k++) {
				System.out.print("*");
			}
			nst1--;
			nsp1++;
			System.out.println();
		}
	}

}
