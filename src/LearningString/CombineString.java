package LearningString;

import java.util.StringJoiner;

public class CombineString {

	public static void main(String[] args) {


		StringJoiner str=new StringJoiner(",","[","]");
		
		str.add("Tom").add("LOM").add("POM");
		System.out.println(str);

	}

}
