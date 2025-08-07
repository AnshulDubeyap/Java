package AnshulsJava.OOps.AbstractClass;

abstract public class Car {
	// Car can play music
	public void play() {
		System.out.println("Play functionality implemented");
	}

	// Car can drive

	// I don't know how to drive, someone can do it for me, but I need a car without drive I cannot get a car
	// So, I will declare a drive method, an empty method which is not implemented (gives an error)
	// public void drive();

	// To make the drive method but not implement, we use an abstract keyword
	// if any method is declared as abstract, it must be overridden in the child class (someone will drive for me)

	// if any property is declared as abstract, the class must be declared as abstract as well
	abstract public void drive();
}
