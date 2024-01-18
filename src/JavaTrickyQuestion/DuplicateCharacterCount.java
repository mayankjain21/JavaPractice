package JavaTrickyQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterCount {

	public static void main(String[] args) {

 
		PrintDuplicateCharacter("mayank");
		
		 String input = "hello world";
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Counting duplicate characters
	        for (char c : input.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Displaying duplicate characters and their counts
	        System.out.println("Duplicate characters and their counts:");
	        charCountMap.forEach((key, value) -> {
	            if (value > 1) {
	                System.out.println(key + ": " + value);
	            }
	        });
		
	}
	
	
	
	public static void PrintDuplicateCharacter(String str) {
		
		if(str.length()==1) {
			System.out.println("Single char string");
		}
		
		if(str.isEmpty()) {
			System.out.println("String is empty");
		}
		
		char word[]=str.toCharArray();
		
		Map<Character, Integer> map1=new HashMap<Character, Integer>();
		for( Character ch:word) {
			if(map1.containsKey(ch)) {
				map1.put(ch, map1.get(ch)+1);
			}
			else {
				map1.put(ch, 1);
			}
		}
		
		//print the map
		Set<Map.Entry<Character, Integer>> set1= map1.entrySet();
		for(Map.Entry<Character, Integer> entry:set1) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
		
		
	}

}
