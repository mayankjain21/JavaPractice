package JavaTrickyQuestion;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicateElement {

	public static void main(String[] args) {


		String []str= {"Akash","Sujata","Raman","Akash","Prakash","Sujata","Menka"};
		
		Integer [] arr= {1,2,3,4,5,1,2,6,5,7,8};
		
		System.out.println("brute Force Method");
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
						System.out.println(str[i]);
				}
			}	
		}
		
		//HashSet
		System.out.println("*******HashSet*********");
		Set<String> hashSet=new HashSet<String>();
		for(String e:str) {
			if(hashSet.add(e)==false) {
				System.out.println(e);
			}
		}
		
		System.out.println("*******TreeSet*********");
		Set<String> treeSet=new TreeSet<String>();
		for(String e:str) {
			if(treeSet.add(e)==false) {
				System.out.println(e);
			}
		}
		
		
		System.out.println("**********");

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
						System.out.println(arr[i]);
				}
			}	
		}
		
		System.out.println("**********");

		Set<Integer> treeSet1=new TreeSet<Integer>();
		for(Integer e:arr) {
			if(treeSet1.add(e)==false) {
				System.out.println(e);
			}
		}
		
	}

}
