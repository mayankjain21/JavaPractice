package LearningString;

public class StringA {

	public static void main(String[] args) {


		String aString="ABC";
		String bString="ABC";
		
		System.out.println(aString==bString);
		System.out.println(aString.equals(bString));
		
		String cString="ABC";
		String dString=new String("ABC");
		
		System.out.println(cString==dString);
		System.out.println(cString.equals(dString));
		
		String eString=new String("ABC");
		String fString=new String("ABC");
		
		System.out.println(eString==fString);
		System.out.println(eString.equals(fString));

	}

}
