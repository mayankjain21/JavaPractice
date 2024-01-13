package LearnPattern;

public class SandglassStar {

	public static void main(String[] args) {

		 int n=10,nsp=0,nst=10;
		 for(int i=0;i<n;i++) 
		 {
			 for(int k=1;k<=nsp;k++) 
			 {
	    		 System.out.print(" ");
	    	 }		 
    	 for(int j=1;j<=nst;j++) {
    		 System.out.print("* ");
    	 }    	 
    	 nst--;
    	 nsp++;
    	 System.out.println();
     }
		 
		 int n1=10,nsp1=9,nst1=1;
		 for(int i=0;i<n1;i++) 
		 {
			 for(int k=1;k<=nsp1;k++) 
			 {
	    		 System.out.print(" ");
	    	 }		 
    	 for(int j=1;j<=nst1;j++) {
    		 System.out.print("* ");
    	 }    	 
    	 nst1++;
    	 nsp1--;
    	 System.out.println();
     }

	}

}
