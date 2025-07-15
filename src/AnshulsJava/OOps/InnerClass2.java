package AnshulsJava.OOps;

class Test{
	static String name; // static variable, shared by all objects (remains similar for all objects)
	Test(String name){
		Test.name = name;
	}
}

public class InnerClass2 {

	// static class (does not depend on the object of the Outside Class)
	static class Test2{
		String name;
		Test2(String name){
			this.name = name;
		}
	}


	public static void main(String[] args) {

		Test obj = new Test("Anshul"); // static variable changes to Anshul, static variables are similar for all objects
		Test obj2 = new Test("Kunal"); // static variable changes to Kunal, static variables are similar for all objects

		System.out.println(obj.name); // output = Kunal (because the last changed was to Kunal, and static variables are shared by all objects)
		System.out.println(obj2.name); // output = Kunal


		Test2 obj3 = new Test2("Anshul");//variable changes to Anshul (class is static, not variable)
		Test2 obj4 = new Test2("Kunal"); // variable changes to Kunal (class is static, not variable)

		System.out.println(obj3.name); // output = Anshul // static class can have objects inside another static class
		System.out.println(obj4.name); // output = Kunal // static class can have objects inside another static class

	}
}
