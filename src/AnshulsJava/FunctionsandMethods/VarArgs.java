package AnshulsJava.FunctionsandMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		// variable arguments means we do not know how much arguments a function needs

		fun(1, 2, 3, 4, 5, 6, 7, 8, 9);// output = [1, 2, 3, 4, 5, 6, 7, 8, 9]

		// the v stores the Array of arguments, it can be Array of Strings, chars etc

		multiple(12, 13, "Anshul", "Dubey", "Joel", "Beans"); // output = 25[Anshul, Dubey, Joel, Beans]


	}

	static void fun(int ...v){
		System.out.println(Arrays.toString(v));
	}

	// Create a function that takes some numbers and remaining variables strings as arguments
	static void multiple(int a, int b, String...y){
		System.out.println(a + b + Arrays.toString(y));
	}
}
