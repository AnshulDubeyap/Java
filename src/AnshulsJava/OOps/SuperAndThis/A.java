package AnshulsJava.OOps.SuperAndThis;

public class A{

	// default constructor
	public A(){
		// this(); // calls itself (infinite loop)
		System.out.println("in A");
	}

	// parameterized constructor
	public A(int a){
		this(); // calls the default constructor of A
		System.out.println("in A parameterized");
	}
}
