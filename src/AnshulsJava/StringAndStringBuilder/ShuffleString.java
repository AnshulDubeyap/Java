package AnshulsJava.StringAndStringBuilder;

public class ShuffleString {
	// Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
	// Output: "leetcode"

	public static void main(String[] args) {
		String str = "codeleet";
		int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

		char[] result = new char[str.length()];


		for (int i = 0; i < str.length(); i++) {
			result[indices[i]] = str.charAt(i);
		}


		String shuffled = new String(result);

		System.out.println("Shuffled string: " + shuffled);
	}
}
