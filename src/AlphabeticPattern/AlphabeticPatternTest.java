package AlphabeticPattern;

public class AlphabeticPatternTest {

	public static void main(String[] args) {


	/*  A
		AB
		ABC
		ABCD
		ABCDE */
		
		int n=5,nsp=5,nst=1;
		
		for(int i=0;i<n;i++) {
			char alphabeticChar = (char) ('A' + i);
			for(int j=0;j<nsp;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<nst;k++) {
				System.out.print(alphabeticChar);
				//Alphabeticchar++;
			}
			nsp--;
			nst++;
			System.out.println();
		}

	}

}
