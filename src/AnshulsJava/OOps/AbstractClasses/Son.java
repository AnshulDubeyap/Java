package AnshulsJava.OOps.AbstractClasses;

public class Son extends Parent{
	int age;

	@Override
	void career() {
		String name = "Software Developer";
		System.out.println(name + " is my career");
	}
	@Override
	void partner() {
		String name = "Jimmy";
		int age = 28;
		System.out.println(name + " is my partner and they are " + age + " years old");
	}

	Son(int age) {
		this.age = age;
	}
}
