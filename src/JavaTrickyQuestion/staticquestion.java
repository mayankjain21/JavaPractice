package JavaTrickyQuestion;

public class staticquestion {
	
	
	static {
		System.out.println("static block");
	}
	
	public static void Display ()
	{
		System.out.println("Static Question");
		Display1();
	}

	
	public static void Display1 ()
	{
		System.out.println("Static Question");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		Display();

	}

}
