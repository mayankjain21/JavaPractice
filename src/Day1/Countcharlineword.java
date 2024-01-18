package Day1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Countcharlineword {

	public static void main(String[] args) {


		String pathString="C:/Users/Hp/OneDrive/Documents/Test.txt";
		
		int charCount=0;
		int lineCount=0;
		int WordCount=0;		
		BufferedReader reader;
		
		try {
			
			reader=new BufferedReader(new FileReader(pathString));
			
			String curlineString=reader.readLine();
			while(curlineString!=null) {				
				lineCount++;				
				//
				String[] woStrings=curlineString.split(" ");
				WordCount=WordCount+woStrings.length;				
				//
				for(String wordString: woStrings) {
					charCount=charCount+wordString.length();
				}				
				curlineString=reader.readLine();				
			}			
			System.out.println(lineCount);
			System.out.println(charCount);
			System.out.println(WordCount);
		} catch (Exception e) {
			
		}

	}

}
