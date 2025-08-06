package AnshulsAdvanceJava.Generics;

public class DualGenericHolder <T, V> {
	public T obj1;
	public V obj2;

	// Constructor
	public DualGenericHolder(T obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// Method
	public T getObj1() {
		return obj1;
	}
	public V getObj2() {
		return obj2;
	}


	public static void main(String[] args) {

		// Using generic class DualGenericHolder as Integer and String

		DualGenericHolder<Integer, String> obj1 = new DualGenericHolder<Integer, String>(10, "Anshul"); // Integer and String type
		System.out.println(obj1.getObj1()); // Output: 10
		System.out.println(obj1.getObj2()); // Output: Anshul

		DualGenericHolder<String, Integer> obj2 = new DualGenericHolder<String, Integer>("Anshul", 10); // String and Integer type
		System.out.println(obj2.getObj1()); // Output: Anshul
		System.out.println(obj2.getObj2()); // Output: 10
	}

}
