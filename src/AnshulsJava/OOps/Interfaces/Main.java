package AnshulsJava.OOps.Interfaces;

public class Main {
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
