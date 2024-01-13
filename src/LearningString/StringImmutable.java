package LearningString;

public class StringImmutable {

	public static void main(String[] args) {
		String string=new String("Mayank");
		string.concat("Jain");
		System.out.println(string);
		System.out.println();
		
		String ssString="Chandni";
		ssString.concat("Jain");
		System.out.println(ssString);
		
		
		String s1=new String("hi");
		String s2=new String("hi");
		System.out.println(s1.equals(s2));

	}

}
