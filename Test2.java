package maven_pr;

public class Test2 {

//    WAP to check if 2 strings are anagram n print different permutations

	
	public static void main(String[] args) {
		String word1="keepl";
		String word2="peekk";
		boolean temp = false;
		if (word1.length()==word2.length()) {
			System.out.println("size is matching");
			
			char[] word1arry = word1.toCharArray();
			char[] word2arry = word2.toCharArray();
			
			for (int i = 0; i < word1arry.length; i++) {
				temp = false;
				for (int j = 0; j < word2arry.length; j++) {
					
				if (word1arry[i] == word2arry[j]) {
				temp = true;
					break;	
				}
					
				}
				
			}
			if (!temp) {
				System.out.println("word is anagram");
			}
			else {
				System.out.println("word is not anagram");
			}
				
			
		}
		else
	{
			System.out.println("word is not anagram");
			
		}
		
		
	}
}
