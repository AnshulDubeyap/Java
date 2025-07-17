package AnshulsJava.OOps.Interfaces;

public interface CarEngine {
	// Car Engine will have three methods, Start, Stop, Accelerate, and variable price

	static final int PRICE = 750000; // all variables are static and final in interfaces

	public void startEngine();
	public void stopEngine();
	public void accelerateEngine();


}
