package AnshulsJava.FunctionsandMethods;

public class Shadowing {
	static int x = 100; // The variable is declared at the Top of scope
	public static void main(String[] args) {

		System.out.println(x); // output = 100
		int x = 30;
		System.out.println(x); // output = 30 (The variable at the top is shadowed by variable declared in the scope)


	}
	static void numbers(){
		System.out.println(x); // output = 100
	}

}
