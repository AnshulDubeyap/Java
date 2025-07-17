package AnshulsJava.StringAndStringBuilder;

public class MergeStringsAlternately {
//	Input: word1 = "abc", word2 = "pqr"
//	Output: "apbqcr"

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pqr";
		String merge = "";

		for(int i = 0; i < word1.length(); i++) {
			merge = merge + word1.charAt(i) + word2.charAt(i);
		}

		System.out.println(merge);  // apbqcr
	}
}
