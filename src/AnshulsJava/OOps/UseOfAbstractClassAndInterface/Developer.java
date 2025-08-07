package AnshulsJava.OOps.UseOfAbstractClassAndInterface;

public class Developer {
	public void coding(Laptop lap) {
		System.out.println("Developer acquires a Laptop");
		lap.code();
	}

	public void coding(Desktop desk) {
		System.out.println("Developer acquires a Desktop");
		desk.code();
	}

	public void coding(Computer com) {
		System.out.println("Developer acquires a Computer");
		com.code();
	}
}
