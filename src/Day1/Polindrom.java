package Day1;

public class Polindrom {
	
	public static void main(String args[]) {
		
		int x=121,rev=0;

		int temp=x;

		

		while(x>0)
		{

		  int a=x%10;
		  x=x/10;
		rev=rev*10+a;
		}

		if(rev==temp)

		{
		System.out.print("number is polindrom");

		}

		else

		{

		  System.out.println("number is not polindrom");

		}

		System.out.println();

		String str="mayank", rev1="";

		int len=str.length();

		for(int i=len-1;i>=0;i--)


		{

		   rev1=rev1+str.charAt(i);
		}

		System.out.println(rev1);
System.out.println();


		String subString="MAYANK";
		
		
		for(int i=0;i<subString.length();i++) {
			for(int j=i+1;j<subString.length();j++) {
				System.out.println(subString.substring(i,j-1));
			}
		}
		
		System.out.println();
		
		String string="i am Geeks for Geeks and a Geek";
		
		String[] ch=string.split(" ");
		char[] ch1=string.toCharArray();
		System.out.println(ch1);
		for(String C:ch) {
			if(C.length()%2==0) {
				System.out.println(C);
			}
		}
		
		
		
		System.out.println();
		
		
	   String strAString="Hello";
	   String strBString="hello";
	   String strCString="Hello";
	   System.out.println(strAString==strCString);
	   System.out.println(strAString.equals(strCString));
	   System.out.println(strAString==strBString);
	   System.out.println(strAString.equals(strBString));
	   System.out.println(strAString=strBString);
	   System.out.println(strAString.equalsIgnoreCase(strBString));
	  
		
		
	}
}
