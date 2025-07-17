package AnshulsJava.OOps.Annotations;

public interface InterfaceB {
	void greet();

	static void hello(){ // static methods in the interface must have a body (obvious reason)
		System.out.println("This is a static method");
	}

	// default methods in the interface can have a body, but static methods must have a body because.
	// static cannot be inherited, thus they cannot be overridden, thus they must have a body
	// unlike static methods, default methods can be overridden and inherited
}
