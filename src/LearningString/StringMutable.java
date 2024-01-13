package LearningString;

public class StringMutable {

	public static void main(String[] args) {


		StringBuffer stringBuffer=new StringBuffer("Mayank");
		StringBuffer s1=stringBuffer.append("Jain");
		System.out.println(s1);
		
		StringBuffer ssBuffer=new StringBuffer();
		ssBuffer.append("Jain").append("Mayank").reverse();
		System.out.println(ssBuffer);
		
		System.out.println(ssBuffer.capacity());

	}

}
