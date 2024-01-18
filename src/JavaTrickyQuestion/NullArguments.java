package JavaTrickyQuestion;

public class NullArguments {

	public static void main(String[] args) {
		test(null);

	}
	
	public static void test(Object s) {
		System.out.println("Object Test created");
	}
	public static void test(String s) {
		System.out.println("String Test created");
	}
	/*
	 * public static void test(StringBuffer s) {
	 * System.out.println("StringBuffer Test created"); }
	 */
	
	/*
	 * public static void test(StringBuilder s) {
	 * System.out.println("StringBuilder Test created"); }
	 */

}
