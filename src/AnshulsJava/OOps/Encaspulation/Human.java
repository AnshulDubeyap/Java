package AnshulsJava.OOps.Encaspulation;

public class Human {
	// private variable
	// Whenever we create an instance variable, it should be private (no one would be able to access it outside the class)
	private int age;
	private String name;

	// getter method
	public int getAge() {
		return age;
	}

	// getter method
	public String getName() {
		return name;
	}

	// setter method
	public void setAge(int a) {
		age = a;
	}

	// setter method
	public void setName(String n) {
		name = n;
	}
}
