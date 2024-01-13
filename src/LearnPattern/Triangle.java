package LearnPattern;

public class Triangle {

	public static void main(String[] args) {

int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==j || i==n) {
					System.out.print("*");
				}
				else { 
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		int dividend = 25, divisor = 4;

	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);

	}

}
