package AnshulsJava.OOps.InnerClass;

public class Class_A {
	public void show() {
		System.out.println("Class A");
	}

	// Static method of an outer class
	static void play() {
		System.out.println("Play functionality implemented");
	}

	// Inner class (nested class)
	public class Class_B {
		// method
		public void show1() {
			System.out.println("Class B");
		}
	}

	// Static inner class
	static class Class_C {

		// Static method inside static inner class
		static public void show2() {
			System.out.println("Class C static");
		}

		// Non-static method inside a static inner class
		public void show3() {
			System.out.println("Class C non static");
		}
	}
}
