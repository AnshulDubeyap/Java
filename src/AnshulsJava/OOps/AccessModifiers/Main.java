package AnshulsJava.OOps.AccessModifiers;

public class Main {

	// Public → Mark your methods as public; they can be accessed anywhere, even outside the package.
	// Always use the public access modifier for methods if you want to call them from other classes or packages.

	// Private → Mark variables as private, they can be accessed only within the same class.
	// Always use the private access modifier for variables; they can be accessed using public getter and setter methods. (This is called encapsulation.)

	// Protected → Mark some variables as protected, they can be accessed within the same package.
	// Protected cannot be accessed directly from outside the package.

	// To get access to a protected variable in another package, inherit the class (extend it in a subclass),
	// and then you can access the protected variable through the subclass object.

	// Default → Mark variables as default, they can be accessed only within the same package
	// Default cannot be accessed directly from outside the package, not even from subclasses in another package

	public static void main(String[] args) {

		// creating an object of Student class
		Student obj = new Student();

		// calling show() method of Student class
		obj.show(); // output = This is a public method

		// calling var variable of Student class
		// System.out.println(obj.phoneNo); // ❌ error, because 'PhoneNo' is private and only accessible inside Student class

		// calling marks variable of Student class
		// 'marks' is protected, so it can be accessed within the same package
		System.out.println(obj.marks); // output = 90.2
	}
}
