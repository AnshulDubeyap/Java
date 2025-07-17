package AnshulsJava.OOps.ObjectCloning;

// implements Cloneable interface
public class Human implements Cloneable {
	int age;
	String name;
	int[] arr = new int[]{12, 13, 14, 15, 16, 17, 18, 19, 123, 312};

	// constructor
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// constructor that takes another Human
	public Human(Human other) {
		this.age = other.age;
		this.name = other.name;
	}

	// clone method from Object class (shallow copy)
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone(); // error, throws CloneNotSupportedException, resolve by mentioning throws
//	}

	// create a deep copy
	public Object clone() throws CloneNotSupportedException {
		Human twin = (Human)super.clone();
		twin.arr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			twin.arr[i] = this.arr[i];
		}
		return twin;
	}
}
