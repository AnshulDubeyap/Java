package AnshulsJava.OOps.Annotations;

public interface InterfaceA {
	 default void fun(){ // default method (it lets us write the body of the method in the interface)
		 System.out.println("This is a default method");
	 };
}
