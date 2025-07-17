package AnshulsJava.OOps.Interfaces;

// Car needs CarEngine, CarBrakes, CarMedia — but if these were classes, Java would give an error due to no multiple inheritance
// So, we use interfaces

// Interfaces are classes that are meant to be implemented by child classes

// Similar to abstract classes, but multiple inheritance is not allowed

public class Car implements CarEngine, CarBrakes, CarMedia{
	// All the methods of CarEngine, CarBrakes, CarMedia will be implemented here (Overridden)

	@Override
	public void startEngine() {
		System.out.println("Engine start functionality implemented");
	}

	@Override
	public void stopEngine() {
		System.out.println("Engine stop functionality implemented");
	}

	@Override
	public void accelerateEngine() {
		System.out.println("Engine accelerate functionality implemented");
	}

	@Override
	public void brake() {
		System.out.println("Brake functionality implemented");
	}

	@Override
	public void pause() {
		System.out.println("Pause functionality implemented");
	}

	@Override
	public void play() {
		System.out.println("Play functionality implemented");
	}

	Car() {
		System.out.println("Car class constructor called");
	}

}
