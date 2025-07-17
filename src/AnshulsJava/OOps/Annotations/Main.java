package AnshulsJava.OOps.Annotations;

public class Main implements InterfaceA, InterfaceB {

	// We can override the default method of interface.
	// But the 'default' keyword helps us to add code in the method of interface

//	@Override
//	 public void fun(){
//		System.out.println("The will make default method overridden");
//	}

	@Override
	public void greet(){
		System.out.println("Greet method is overridden");
	}


	public static void main(String[] args) {
		Main main = new Main();
		main.fun(); // output = This is a default method
		main.greet(); // output = Greet method is overridden

		// U have to call the static method using the Interface name
		InterfaceB.hello(); // output = This is a static method
	}
}
