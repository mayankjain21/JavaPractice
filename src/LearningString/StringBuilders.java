package LearningString;

public class StringBuilders {

	public static void main(String[] args) {

		StringBuilder sBuilder=new StringBuilder("mayank");
		
		sBuilder.append("jain").reverse();
		System.out.println(sBuilder);
		sBuilder.append("Hello");
		sBuilder.reverse();
		System.out.println(sBuilder);
		


	}

}
