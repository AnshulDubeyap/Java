package AnshulsAdvanceJava.Generics;

public class Main {

	// Why lead to develop Generic classes --> To avoid type casting; everything we create weather its class, object, variables, methods etc. are statically typed
	// thus when needing to use objects of different types, we need to create 4 different classes
	// this is not efficient, so we can create a generic class
	// Generics --> A way to create a class, variable, method that can be used with different data types

	public static class AnshulClass<T>{

		// Take in a generic type, a T variable
		T obj;

		// Constructor
		public AnshulClass(T obj) {
			this.obj = obj;
		}

		// Method
		public T getData() {
			return obj;
		}

	}

	public static void main(String[] args) {

		// Using generic class AnshulClass as Integer and String

		AnshulClass<Integer> obj1 = new AnshulClass<Integer>(10); // Integer type
		System.out.println(obj1.getData()); // Output: 10

		AnshulClass<String> obj2 = new AnshulClass<String>("Anshul"); // String type
		System.out.println(obj2.getData()); // Output: Anshul

	}


}
