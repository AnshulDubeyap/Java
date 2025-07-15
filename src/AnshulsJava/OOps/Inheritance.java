package AnshulsJava.OOps;

class Box{
	double length;
	double width;
	double height;
	private double volume; // private: cannot be accessed directly by child class (BoxWeight)

	// Constructor's
	Box(double l, double w, double h){
		this.length = l;
		this.width = w;
		this.height = h;
	}

	Box(double side){
		this.length = side;
		this.width = side;
		this.height = side;
	}

	Box(Box oldBox){
		this.length = oldBox.length;
		this.width = oldBox.width;
		this.height = oldBox.height;
	}

	public void display(){
		System.out.println("This is a box");
	}


}

// Inheritance, BoxWeight inherits Box
// Inheritance means child class inherits from parent class the properties and methods
// child class can have its own properties and have access to all the properties and methods of the parent class

class BoxWeight extends Box{
	double weight;


	BoxWeight(double l, double w, double h, double m){
		super(l,w,h); // super keyword is used to call the constructor of the parent class
		// if the super keyword is not used, the default constructor of the parent class will be called
		this.weight = m;
	}

	BoxWeight(double w, BoxWeight oldBox){
		super(oldBox);
		this.weight = oldBox.weight;
	}

}

public class Inheritance {
	public static void main(String[] args) {

		// Creating a Box object
		Box mybox = new Box(10, 20, 15); // length = 10, width = 20, height = 15
		mybox.display(); // output = This is a box
		System.out.println(mybox.length + " " + mybox.width + " " + mybox.height); // output = 10.0 20.0 15.0

		// Passing a Box object inside another Box object
		Box mybox2 = new Box(mybox);
		System.out.println(mybox2.length + " " + mybox2.width + " " + mybox2.height); // output = 10.0 20.0 15.0


		// Creating a BoxWeight object
		BoxWeight mybox3 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox4 = new BoxWeight(2, 3, 4, 0.076);

		mybox3.display(); // output = This is a box
		mybox4.display(); // output = This is a box
		System.out.println(mybox3.length + " " + mybox3.width + " " + mybox3.height + " " + mybox3.weight); // output = 10.0 20.0 15.0 34.3
		System.out.println(mybox4.length + " " + mybox4.width + " " + mybox4.height + " " + mybox4.weight); // output = 2.0 3.0 4.0 0.076

		// We can create a BoxWeight object from a Box type reference variable
		Box mybox5 = new BoxWeight(10, 20, 15, 34.3);
		mybox5.display(); // output = This is a box
		System.out.println(mybox5.length + " " + mybox5.width + " " + mybox5.height); // output = 10.0 20.0 15.0
		// System.out.println(mybox5.weight); // Error, because weight is not a part of Box class


		// Using the inherited oldBox constructor
		BoxWeight mybox6 = new BoxWeight(10, 50, 15, 35.3);
		System.out.println(mybox6.length + " " + mybox6.width + " " + mybox6.height + " " + mybox6.weight); // output = 10.0 20.0 15.0 34.3
		BoxWeight mybox7 = new BoxWeight(50, mybox6);
		System.out.println(mybox7.length + " " + mybox7.width + " " + mybox7.height + " " + mybox7.weight); // output = 10.0 20.0 15.0 34.3


		// Using the inherited oldBox constructor (Creating a BoxWeight object from a Box type reference variable)
		Box mybox8 = new BoxWeight(50, mybox6);
		System.out.println(mybox8.length + " " + mybox8.width + " " + mybox8.height); // output = 10.0 50.0 15.0

	}

}
