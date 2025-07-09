package AnshulsJava.Arrays;

public class Pangram {
	public static void main(String[] args) {
		// String contains every letter of alphabets at least once
		// String must have no whitespace, and all letters must be in the lowercase

		String str = "thequickbrownfoxjumpsoverthelazydog";

		CheckPangram(str);
	}

	static void CheckPangram(String str) {
		int flag = 0;

		for (char j = 'a'; j <= 'z'; j++) {
			for (int i = 0; i < str.length(); i++) {
				char dh = str.charAt(i);
				if (j == dh) {
					flag = flag + 1;
					break;
				}
			}
		}

		if (flag == 26) {
			System.out.println("Yes the string " + str + " is Pangram");
		} else {
			System.out.println("No the string " + str + " is NOT Pangram");
		}
	}
}
