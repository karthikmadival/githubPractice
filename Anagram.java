package maven_pr;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String St1, String St2) {
		boolean anagram = false;

		if (St1.length() == St2.length()) {
			
			char[] charry1 = St1.toLowerCase().toCharArray();
			char[] charry2 = St2.toLowerCase().toCharArray();
			Arrays.sort(charry1);
			Arrays.sort(charry2);
			for (int i = 0; i < charry2.length; i++) {
				if (charry1[i] == charry2[i]) {
					anagram = true;
				} else {
					anagram = false;
				}
			}

		}
		return anagram;
	}

	public static void main(String[] args) {

		String St1 = "SILENT";
		String St2 = "LISTEn";

		if (isAnagram(St1, St2)) {
			System.out.println("Two strings are anagram");
		} else {
			System.out.println("Two string are not anagram");
		}

	}

}
