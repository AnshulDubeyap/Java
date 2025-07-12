package AnshulsJava.StringAndStringBuilder;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		//Strings in Java are immutable for security reasons

		// Here str and str1 are reference variable pointing to the same object
		String str = "Anshul";
		String str1 = "Anshul";


		// Here the String 'a' is not mutated, but a different object is created "Dubey"
		// the reference variable 'a' is pointing to the newly created object "Dubey"
		String a = "Ashwin";
		System.out.println(a); // output = Ashwin
		a = "Dubey"; // output = Dubey


		// Comparison in Strings

		String c = "Kunal";
		String d = "Kunal";

		System.out.println(c == d); // Output=true (both references pointing to the same object)

		String e = new String("Cambam");
		String f = new String("Cambam");

		System.out.println(e == f); // Output=False (both references pointing to a different object)

		// "==" checks both reference and value, two reference points to the same Object
		// ".equals()" checks only value


		System.out.println(c.equals(d)); // output = true (only checks value)
		System.out.println(e.equals(f)); // output = true

		// Concatenation In String

		System.out.println("a" + "bcd"); // output = abcd
		System.out.println("a" + 134); // output = a134
		// integer 134 is converted to Integer than to.String() method applied to it automatically

		System.out.println("a" + new ArrayList<>()); // output = a[]

		System.out.println("a" + new Integer(56)); // output = a56

		// Operator '+' in Java only works for primitive or only if one of the values is String


		//String Builder

		String series = "";

		for(int i = 0; i < 26; i++){
			char ch = (char)('a' + i); // TypeCasting
			series = series + ch;
		}

		System.out.println(series); // output = abcdefghijklmnopqrstuvwxyz

		// As we know, strings are immutable so, for every iteration in the loop above a new object is being created, that is a lot of waste storage
		// Thus we Introduce StringBuilder, that mutates String without creating a new Object

		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < 26; i++){
			char ch = (char)('a' + i);
			builder.append(ch);
		}
		System.out.println(builder); // output = abcdefghijklmnopqrstuvwxyz


		// Methods that String Provides

		String name = "Anshul Dubey";
		System.out.println(Arrays.toString(name.toCharArray())); // output = [A, n, s, h, u, l,  , D, u, b, e, y]

		System.out.println(name.toLowerCase()); // output = anshul dubey

		System.out.println(name.indexOf('D')); // output = 7

	}
}
