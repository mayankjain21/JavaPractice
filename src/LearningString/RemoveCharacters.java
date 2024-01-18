package LearningString;

public class RemoveCharacters {

	public static void main(String[] args) {

    //given two string s1 & s2 and remove those character from first string(s1) which are present
	// in second string (s2) in java
		
		    String s1 = "hello";
	        String s2 = "world";
	        String result = removeCharacters(s1, s2);
	        System.out.println("Result after removing characters from s2: " + result);
	    }

	private static String removeCharacters(String s1, String s2) {
		StringBuilder result = new StringBuilder();

        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString();
    }

	}


