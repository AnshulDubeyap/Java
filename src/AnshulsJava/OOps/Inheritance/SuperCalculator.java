package AnshulsJava.OOps.Inheritance;

public class SuperCalculator extends AdvanceCalculator{

	public int power(int a, int b) {
		return (int)Math.pow(a, b);
	}

	public int sqrt(int a) {
		return (int)Math.sqrt(a);
	}

	public int mod(int a, int b) {
		return a % b;
	}
}
