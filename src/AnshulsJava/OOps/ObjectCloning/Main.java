package AnshulsJava.OOps.ObjectCloning;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {

		Human anshul = new Human(21, "Anshul");

		Human twin = new Human(anshul);

		// The above method takes a lot of time because it has to copy the object in the memory
		System.out.println(anshul.name); // output = Anshul
		System.out.println(twin.name); // output = Anshul

		// clone() method is a method in Object class that does the same thing as the above method
		// This is a Shallow copy (changes in the objects inside the object are reflected in both the objects)

		Human twin2 = (Human)anshul.clone(); // error, throws CloneNotSupportedException, resolve by mentioning throws
		System.out.println(twin2.name); // output = Anshul
		System.out.println(twin2.age); // output = 21

		// changes made in twin2 are reflected in twin and anshul
		twin2.arr[1] = 1000;
		System.out.println(anshul.arr[1]); // output = 13 // deep copy
		System.out.println(twin.arr[1]); // output = 13 // deep copy

		// Deep copy -> changes made in twin2(in objects) are not reflected in twin and anshul

	}
}
