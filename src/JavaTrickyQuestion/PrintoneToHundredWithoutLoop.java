package JavaTrickyQuestion;

public class PrintoneToHundredWithoutLoop {

	public static void main(String[] args) {
	printnum(0);

	}	
	public static void printnum(int num) {
		
		if(num<100) {
			System.out.println(num);
			num++;
			printnum(num);
		}
		
	}

}
