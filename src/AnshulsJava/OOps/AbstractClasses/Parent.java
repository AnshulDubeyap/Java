package AnshulsJava.OOps.AbstractClasses;

// Abstract class are classes that are meant to overridden by child classes; thus they do not have a body
// When any method is declared as abstract, it must be overridden in the child class
// When any property is declared as abstract, the class must be declared as abstract as well.
// Abstract classes cannot be instantiated (cannot create objects of abstract classes)


abstract public class Parent { // Parent class is declared as abstract because it has abstract methods
	abstract void career(); // abstract method
	abstract void partner(); // abstract method
}
