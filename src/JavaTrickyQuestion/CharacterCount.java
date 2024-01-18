package JavaTrickyQuestion;

public class CharacterCount {

	public static void main(String[] args) {
		 String input = "hello world";
	        char targetChar = 'l';

	        int count = countOccurrences(input, targetChar);

	        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
	    }

	    private static int countOccurrences(String input, char targetChar) {
	        int count = 0;

	        for (char c : input.toCharArray()) {
	            if (c == targetChar) {
	                count++;
	            }
	        }

	        return count;
	}

}
