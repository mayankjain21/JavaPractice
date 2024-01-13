package LearnPattern;

public class DiamondShapePattern {

	public static void main(String[] args) {
		
		int n=8,nsp=7,nst=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=nst;k++) {
				System.out.print("*");
			}
			nst=nst+2;
			nsp--;
			System.out.println();
		}		
		int n1=7,nsp1=1,nst1=13;
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=nsp1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=nst1;k++) {
				System.out.print("*");
			}
			nst1=nst1-2;
			nsp1++;
			System.out.println();
		}
	}

}
