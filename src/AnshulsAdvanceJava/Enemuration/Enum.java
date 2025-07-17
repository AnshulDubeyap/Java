package AnshulsAdvanceJava.Enemuration;

public class Enum {
	// enum is a set of constants, words that cannot be changed like weekdays, months, seasons, etc.
	// enum is used to represent a set of related constants

	// enum is a class, enum words are created using uppercase, sometimes enum constants have values associated with them

}

enum colors{
	RED("Red"), GREEN("Green"), BLUE("Blue"); // enum constants

	private String colorName;

	// constructor
	colors(String colorName) {
		this.colorName = colorName;
	}

	// getter
	public String getColorName() {
		return colorName;
	}

}
