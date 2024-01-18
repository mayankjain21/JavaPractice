package JavaTrickyQuestion;

public class Staticcheck {

	public static void main(String[] args) {
	System.out.println(test.x);

	}

}

class test{
	public static final int x=12;
	static {
		System.out.println("Hello Static block");
	}
}

//Will Static block be executed with final variable?
