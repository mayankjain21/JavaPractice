package LearnPattern;

public class TriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,nst=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nst;j++) {
				System.out.print("*");
			}
			nst--;
			System.out.println();
		}

	}

}
