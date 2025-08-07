package AnshulsJava.OOps.Interface;

public class Main {

	// Interface is like an abstract class, but we can implement multiple interfaces (not possible with abstract classes)
	// Used to achieve abstraction and multiple inheritance in Java

	// Three types of interfaces:
	// 1. Functional Interface – has only one abstract method
	// 2. Marker Interface – has no methods
	// 3. Normal Interface – has multiple abstract methods

	// All variables in interfaces are by default static and final (constants)
	// All methods in interfaces are by default public and abstract

	public static void main(String[] args) {
		Car car = new Car();
		car.startEngine();
		car.accelerateEngine();
		car.brake();
		car.pause();
		car.play();
		car.stopEngine();
		System.out.println(car.PRICE); // output = 750000
	}
}
