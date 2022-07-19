package maven_pr;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	//WAP to use print number of occurence of each character in ur name
	

	public static void main(String[] args) {
		String st="Karthik";
		
		char[] ch=st.toCharArray();
		int temp=1;
//		int ntemp=0;
		
		for (int i = 0; i < ch.length; i++) {
		  for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					temp= temp+1;
				}
				
			}
			System.out.println("letter "+ ch[i] + " repeated " + temp );
		}
		
		System.out.println("2n progrm");
		name();
	}
	
	
	public static void name() {
		String[] al= {"karthik", "Madival", "karthik" };
		
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < al.length; i++) {
		    set.add(al[i]);
		}

		for (String str : set) {
		    System.out.println(str);
		}
		
	}

}
