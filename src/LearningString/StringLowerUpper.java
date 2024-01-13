package LearningString;

public class StringLowerUpper {

	public static void main(String[] args) {

     String str="aLgoPrep";
     
     int len=str.length();
     char[] ch=new char[len];
     
     for(int i=0;i<len;i++) {
    	 ch[i]=str.charAt(i);    	 
     }
    Toggle(ch);
    System.out.println( ch);
	}

	private static void Toggle(char[] ch) {

     for(int i=0;i<ch.length;i++) {
    	 if(ch[i]>=65 && ch[i]<=90) {
    		 ch[i]=(char)(ch[i]+32);
    	 }
    	 else {
    		 ch[i]=(char)(ch[i]-32);
    	 }
     }
		
	}

}
