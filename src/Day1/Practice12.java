package Day1;

public class Practice12 {

	public static void main(String[] args) {


		String string="Mayank";
		int len=string.length();
		String revString="";
		for(int i=len-1;i>=0;i--) {
			revString=revString+string.charAt(i);
		}
		System.out.println(revString);
		
		
		int x=12345, rev=0;
		while(x!=0) {
			int y=x%10;
			x=x/10;
			rev=rev*10+y;
		}
		System.out.println(rev);
		System.out.println();
		
		int x1=12345, rev1=0;
		while(x1>0) {
			int y=x1%10;
			rev1=rev1+y;
			x1=x1/10;
			
		}
		System.out.println(rev1);
		
		
		
		
	}

}
