package AnshulsJava.OOps.SuperAndThis;

public class B  extends A{

	// default constructor
	public B() {
		super(); // calls the default constructor of A
		System.out.println("in B");
	}

	// parameterized constructor
	public B(int a) {
		super(a); // calls the parameterized constructor of A
		 // calls the default constructor of B
		System.out.println("in B parameterized");
	}
}
