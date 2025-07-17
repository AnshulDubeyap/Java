package AnshulsJava.OOps.AbstractClasses;

public class Daughter extends Parent{
	int age;


	void career() {
		String name = "Coder";
		System.out.println(name + " is my career");
	}

	void partner() {
		String name = "Cambam";
		int age = 27;
		System.out.println(name + " is my partner and they are " + age + " years old");
	}

	Daughter(int age) {
		this.age = age;
	}

}
