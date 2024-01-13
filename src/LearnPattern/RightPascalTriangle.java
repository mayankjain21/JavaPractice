package LearnPattern;

public class RightPascalTriangle {

	public static void main(String[] args) {

		int n=8,nst=1;
	      for(int i=1;i<=n;i++)
	      {
	    	  for(int j=1;j<=nst;j++)
	    	  {
	    		  System.out.print("* ");
	    	  }
	    	  nst++;
	    	  System.out.println();
	      }	      
	      int n1=8,nstt=7;
	      for(int i=1;i<=n1;i++)
	      {
	    	  for(int j=1;j<=nstt;j++)
	    	  {
	    		  System.out.print("* ");
	    	  }
	    	  nstt--;
	    	  System.out.println();
	      }
	}

}
