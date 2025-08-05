package AnshulsAdvanceJava.AutoBoxingAndUnBoxing.Main;

public class Main {
	public static void main(String[] args) {
		// AutoBoxing --> Converting primitive type to object type(int to Integer)
		
		// UnBoxing --> Converting object type to primitive type(Integer to int)

		int i = 10;

		// Autobox
		Integer Obj = Integer.valueOf(i);

		System.out.println("i = " + i + " Obj = " + Obj);

		// Unbox
		// just assigning object to primitive data type
		int j = Obj;
		System.out.println("i = " + i + " j = " + j);

		Character ch = 'A';
		System.out.println("ch = " + ch);

		// unboxing
		char ch1 = ch;
		System.out.println("ch1 = " + ch1);

	}
}
