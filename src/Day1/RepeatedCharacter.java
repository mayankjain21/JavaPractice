package Day1;

public class RepeatedCharacter {

	public static void main(String[] args) {
		
		String string="aachibbcd#@#";
		char[] ch=string.toCharArray();
		int len=string.length();
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}
		
		
		

	}

}
