package AnshulsAdvanceJava.Enemuration;

public class Main {
	public static void main(String[] args) {
		// How to use enum
		colors c = colors.RED;

		System.out.println(c.name()); // output = RED (prints' name of enum constant)
		System.out.println(c.getColorName()); // output = Red (prints' value of enum constant)

		// Print all enum constants
		for (colors color : colors.values()) {
			System.out.println(color.name() + " " + color.getColorName()); // output = RED Red GREEN Green BLUE Blue
		}
	}
}
