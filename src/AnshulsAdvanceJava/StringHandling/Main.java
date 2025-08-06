package AnshulsAdvanceJava.StringHandling;

public class Main {
	public static void main(String[] args) {
		// Various String methods
		String str1 = "Anshul is going ";
		String str2 = "to study java programming";

		// .length()
		System.out.println(str1.length()); // 22
		System.out.println(str2.length()); // 33 (space is also counted as a character)

		// .charAt()
		System.out.println(str1.charAt(0)); // A
		System.out.println(str2.charAt(0)); // t

		// .concat()
		System.out.println(str1.concat(str2)); // Anshul is going to study java programming

		// .format() (%s for string, %d for integer, %f for float, %b for boolean, %c for character)

		String str3 = String.format("The student name is %s and he is going to study %s and his age is %d", "Anshul", "java", 23);
		System.out.println(str3); // The student name is Anshul and he is going to study java and his age is 23

		// .equals()
		String str4 = "Anshul"; // String literal
		String str5 = new String("Anshul"); // String object

		System.out.println(str4.equals(str5)); // true

		// .equalsIgnoreCase() (case insensitive)
		String str6 = "Anshul"; // String literal
		String str7 = new String("Anshul"); // String object

		System.out.println(str6.equalsIgnoreCase(str7)); // true

		// indexOf()

		int index = str1.indexOf("going");
		System.out.println(index); // 10

		// replace()
		String str8 = str1.replace("going", "coming");
		System.out.println(str8); // Anshul is coming

		// split()
		String str9 = "Anshul is going to study java programming and he is a good student";
		String[] words = str9.split(" ");
		for (String word : words) {
			System.out.println(word);
		}

		// substring()
		String str10 = "Anshul is going to study java programming and he is a good student";
		String str11 = str10.substring(0, 8);
		System.out.println(str11); // Anshul is

	}
}
