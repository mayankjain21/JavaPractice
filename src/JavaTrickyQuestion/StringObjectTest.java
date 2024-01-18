package JavaTrickyQuestion;

public class StringObjectTest {

	public static void main(String[] args) {


		String s1="Hello World";// Always store in heap
		String s2="Hello World";
		String s3="Hello World";
		
		String n1=new String("Hello World");  //heap ^ String constant pool
		String n2=new String("Hello World");
		
		
		System.out.println(s1==s2); // content
		System.out.println(s1==s3);
		System.out.println(s3==s2);
		
		
		System.out.println(s1.equals(s2));// reference
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s3));
		
		System.out.println(n1.equals(n2));
		System.out.println(n1==n2);
		
		

	}

}
