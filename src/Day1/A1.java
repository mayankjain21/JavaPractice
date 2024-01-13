package Day1;

public class A1 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "hello";

		if (s1 == s2) {
		System.out.println("Apple");
		} else {
		System.out.println("Ball");
		}
		if (s1 == s3) {
		System.out.println("Cat");
		} else {
		System.out.println("Dog");
		}
		
		
		String str = " 123 ";
		int num = Integer.parseInt(str.trim());
		System.out.println(num + 1);

	}

}
