package AnshulsJava.StringAndStringBuilder;

public class LengthOfLastWord {
	// Input: s = "Hello World"
	// Output: 5
	public static void main(String[] args) {
		String str = "Hello World";

		int num = 0;
		int i = str.length() - 1;

		while (i >= 0) {
			if (str.charAt(i) == ' ') {
				break;
			}
			num = num + 1;
			i = i - 1;
		}

		System.out.print("The length of last word is : " + num);
	}
}
