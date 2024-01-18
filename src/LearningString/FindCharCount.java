package LearningString;

import java.util.HashMap;
import java.util.Map;

public class FindCharCount {

	public static void main(String[] args) {


		String string="mayank";
		HashMap<Character,Integer> strHashMap=new HashMap<Character,Integer>();
		
		char[] strArray=string.toCharArray();
		
        for(char c:strArray) {
        	if(strHashMap.containsKey(c)) {
        		strHashMap.put(c, strHashMap.get(c)+1);
        	}
        	else {
				strHashMap.put(c, 1);
			}
        }
        // Printing the charCountMap
        for (Map.Entry<Character,Integer> entry : strHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}

}
