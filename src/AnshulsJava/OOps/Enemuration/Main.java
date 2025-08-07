package AnshulsJava.OOps.Enemuration;

public class Main {
	// enum --> Enumeration is a group of constants defined in a class
	// enum is a class that extends Enum class which has some predefined methods
	// enum is a class, but we cannot extend it to other classes
	// we can create constructors and own variables inside the enum class


	public static void main(String[] args) {
		// Status is a class, and all the constants are objects of the Status class

		// How to use enum
		Status s = Status.Running;
		System.out.println(s); // output = Running

		Status s1 = Status.Failed;
		System.out.println(s1); // output = Failed

		// ordinal() method in enum
		// returns the position of the enum constant
		System.out.println(s.ordinal()); // output = 0
		System.out.println(s1.ordinal()); // output = 1


		// values() method in enum (returns an array of all the enum constants)
		// returns an array of all the enum constants
		Status[] arr = Status.values();
		for (Status s2 : arr) {
			System.out.println(s2); // output = Running, Failed, Pending, Success
		}

		// if else
		Status s3 = Status.Failed;
		if (s3 == Status.Failed) {
			System.out.println("Test Case Failed");
		}else {
			if (s3 == Status.Pending) {
				System.out.println("Test Case Pending");
			}else {
				if (s3 == Status.Running) {
					System.out.println("Test Case Running");
				}else {
					if (s3 == Status.Success) {
						System.out.println("Test Case Success");
					}
				}
			}
		}

		// switch case (yes, switch supports enum constants)
		switch (s3) {
		case Failed:
			System.out.println("Test Case Failed");
			break;
		case Pending:
			System.out.println("Test Case Pending");
			break;
		case Running:
			System.out.println("Test Case Running");
			break;
		case Success:
			System.out.println("Test Case Success");
			break;
		default:
			System.out.println("Invalid Status");
			break;
		}


		// Get a Laptop object
		Laptops lap = Laptops.Dell;
		System.out.println(lap.getPrice()); // output = Dell

		// Get all the Laptop objects
		Laptops[] arr2 = Laptops.values();
		for (Laptops lap2 : arr2) {
			System.out.println(lap2); // output = Maker, Dell, Lenovo, Macbook, Asus
			System.out.println(lap2.getPrice());
		}

	}
}
