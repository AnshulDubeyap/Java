package AnshulsJava.OOps.Polymorphism;

class Shape{
	void area(){
		System.out.println("I am in Shapes");
	}
}

class Circle extends Shape{
	void area(){
		System.out.println("I am in Circle");
	}

}

class Rectangle extends Shape{
	void area(){
		System.out.println("I am in Rectangle");
	}

}

class Triangle extends Shape{
	void area(){
		System.out.println("I am in Triangle");
	}

}

class Numbers {

	// Method Overloading, two methods with the same name but different parameters
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	final void sum(int a, int b, int c) { // 'final' keyword means that this method cannot be overridden
		System.out.println(a + b + c);
	}
}

public class Polymorphism {
	public static void main(String[] args) {

		// Creating an object of type shape
		Shape shape = new Shape();
		// Creating an object of type circle
		Circle circle = new Circle();
		// Creating an object of type rectangle
		Rectangle rectangle = new Rectangle();
		// Creating an object of type triangle
		Triangle triangle = new Triangle();

		// Polymorphism is the act of representing the same thing in different ways
		// The same area() method is used in different classes, and the result is different

		shape.area(); // output = I am in Shapes
		circle.area(); // output = I am in Circle
		rectangle.area(); // output = I am in Rectangle
		triangle.area(); // output = I am in Triangle

		// Two types of polymorphism are static and dynamic
		// Static polymorphism (compile time polymorphism) happens when Java decides which method to use at compile time
		// Static polymorphism is also known as method overloading

		Numbers numbers = new Numbers();
		// Method Overloading, two methods with the same name but different parameters results in different outputs
		numbers.sum(3, 4); // output = 7
		numbers.sum(3, 4, 5); // output = 12

		// Dynamic polymorphism (run time polymorphism) happens when Java decides which method to use at run time
		// Dynamic polymorphism is also known as method overriding

		shape.area(); // output = I am in Shapes
		circle.area(); // output = I am in Circle
		// circle's area method overrides the shape's area method

	}
}
