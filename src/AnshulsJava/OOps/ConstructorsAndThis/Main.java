package AnshulsJava.OOps.ConstructorsAndThis;

public class Main {
	// Constructor → A special type of method in a class that runs automatically when an object is created.
	// A constructor has the same name as the class and does not have a return type (not even void).

	// Why do we need a constructor in Java?
	// A constructor is used to give initial values to instance variables when an object is created.
	// It helps set up the object with some default or passed-in values when it's created

	// Every time we create an object, the constructor is called.
	// If we don't write a constructor, the compiler will create a default constructor for us

	// 'this' → 'this' is a reference variable in Java that refers to the current object (the object calling the method).
	// You only need to use 'this' when a method parameter has the same name as an instance variable.
	// If we don’t use 'this' in that case, Java assumes you are referring to the parameter, not the instance variable,
	// so 'this' is used to tell Java: “I mean the variable that belongs to the object, not the parameter.”


	public static void main(String[] args) {

		Student anshul = new Student("Anshul Dubey", 101, 89.9f);
		// here, 'this' is replaced with 'anshul' inside the constructor (the current object)

		System.out.println(anshul.name + " " + anshul.rollNo + " " + anshul.marks); // output = Anshul Dubey 101 89.9

		Student rahul = new Student("Rahul Dubey", 102, 89.9f);
		System.out.println(rahul.name + " " + rahul.rollNo + " " + rahul.marks); // output = Rahul Dubey 102 89.9

		// Using Constructor with arguments
		Books GameOfThrones = new Books("Georege.RR.Martin", "Song of Ice and Fire", 233);
		System.out.println(GameOfThrones.author + " " + GameOfThrones.title + " " + GameOfThrones.bookNo); // output = Georege.RR.Martin Song of Ice and Fire 233

		// Using Constructor without arguments (default constructor)
		Books Np = new Books();
		System.out.println(Np.author + " " + Np.title + " " + Np.bookNo); // output = Georege.RR.Martin Song of Ice and Fire 233

	}
}
