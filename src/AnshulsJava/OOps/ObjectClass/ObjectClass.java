package AnshulsJava.OOps.ObjectClass;

class ObjectDemo{

	int i;

	public int hashCode(){  // hashCode() is a method of Object class
		return super.hashCode();
	}

	public boolean equals(Object obj){ // equals() is a method of Object class
		return super.equals(obj);
	}

	public String toString(){ // toString() is a method of Object class
		return super.toString();
	}

	public void finalize(){ // finalize() is a method of Object class
		System.out.println("Object is garbage collected");
	}

	public ObjectDemo(int i){
		this.i = i;
	}

}

public class ObjectClass {

	public static void main(String[] args) {

		// Object is a class in java that is the parent class of all the classes, it is the root of the class hierarchy
		// Object class contains all the methods that are common to all the classes (toString(), equals(), hashCode(), finalize())


		ObjectDemo obj = new ObjectDemo(67);
		ObjectDemo obj1 = new ObjectDemo(55);

		System.out.println(obj.hashCode()); // output = 1163157884
		System.out.println(obj.equals(obj1)); // output = false
		System.out.println(obj.toString()); // output = AnshulsJava.OOps.ObjectClass.ObjectDemo@4554617c

		// instanceof Method in Object class
		System.out.println(obj instanceof ObjectDemo); // output = true
		System.out.println(obj instanceof Object); // output = true

		// GetClass Method in Object class
		System.out.println(obj.getClass()); // output = AnshulsJava.OOps.ObjectClass.ObjectDemo


	}

}
